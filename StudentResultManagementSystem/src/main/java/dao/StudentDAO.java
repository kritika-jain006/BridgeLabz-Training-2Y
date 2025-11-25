package dao;

import java.sql.*;
import model.Student;
public class StudentDAO {

    public void addStudent(Student s) {
        String query = "INSERT INTO students(student_id, name, course) VALUES (?, ?, ?)";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getCourseId());

            ps.executeUpdate(); //int return krta h (execute() return booleana krta h)
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {
        String query = "SELECT * FROM students";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("student_id") + " | "+ rs.getString("name") + " | "+ rs.getString("course"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
