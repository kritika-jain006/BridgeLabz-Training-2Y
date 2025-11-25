package service;

import dao.ResultDAO;
import model.Result;

public class ResultService {

    private ResultDAO dao = new ResultDAO();

    public void addMarks(int studentId, int subjectId, int marks) {

        String grade = calculateGrade(marks);

        Result r = new Result(studentId, subjectId, marks, grade);
        dao.addResult(r);
    }

    private String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public void viewReportCard(int studentId) {
        dao.viewReportCard(studentId);
    }
}
