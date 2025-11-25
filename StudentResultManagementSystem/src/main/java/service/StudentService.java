package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(Student s) {
        dao.addStudent(s);
    }

    public void getAllStudents() {
        dao.getAllStudents();
    }
}
