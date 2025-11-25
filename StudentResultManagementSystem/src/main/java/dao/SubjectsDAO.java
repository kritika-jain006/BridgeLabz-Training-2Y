package dao;

import java.sql.*;
import model.Subjects;

public class SubjectsDAO {

    public void addSubject(Subjects s) {
        String query = "INSERT INTO subjects(subject_id, course_id, subject_name) VALUES (?, ?, ?)";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, s.getSubjectId());
            ps.setInt(2, s.getCourseId());
            ps.setString(3, s.getSubjectName());

            ps.executeUpdate();
            System.out.println("Subject added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getSubjectsByCourse(int courseId) {
        String query = "SELECT * FROM subjects WHERE course_id = ?";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, courseId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("subject_id") + " | " +
                        rs.getString("subject_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
