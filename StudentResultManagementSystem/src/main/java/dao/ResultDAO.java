package dao;

import java.sql.*;
import model.Result;

public class ResultDAO {

    public void addResult(Result r) {
        String query = "INSERT INTO results(student_id, subject_id, marks, grade) VALUES (?, ?, ?, ?)";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, r.getStudentId());
            ps.setInt(2, r.getSubjectId());
            ps.setInt(3, r.getMarks());
            ps.setString(4, r.getGrade());

            ps.executeUpdate();
            System.out.println("Marks added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewReportCard(int studentId) {
        String query = "SELECT s.subject_name, r.marks, r.grade " +
                       "FROM results r " +
                       "JOIN subjects s ON r.subject_id = s.subject_id " +
                       "WHERE r.student_id = ?";

        try (Connection con = DatabaseManager.connect();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, studentId);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n----- REPORT CARD -----");

            while (rs.next()) {
                System.out.println(
                    rs.getString("subject_name") + " | " +
                    rs.getInt("marks") + " | " +
                    rs.getString("grade")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
