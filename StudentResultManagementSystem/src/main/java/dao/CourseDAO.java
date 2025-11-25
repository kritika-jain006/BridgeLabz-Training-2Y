package dao;

import java.sql.*;
import model.Course;

public class CourseDAO {

    public void addCourse(Course c) {
        String query = "INSERT INTO courses(course_id, course_name, duration) VALUES (?, ?, ?)";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, c.getCourseId());
            ps.setString(2, c.getCourseName());
            ps.setString(3, c.getDuration());

            ps.executeUpdate();
            System.out.println("Course added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllCourses() {
        String query = "SELECT * FROM courses";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("course_id") + " | " +
                        rs.getString("course_name") + " | " +
                        rs.getString("duration")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
