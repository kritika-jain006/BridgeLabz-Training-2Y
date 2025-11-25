package service;

import dao.SubjectsDAO;
import model.Subjects;

public class SubjectService {

    private SubjectsDAO dao = new SubjectsDAO();

    public void addSubject(Subjects s) {
        dao.addSubject(s);
    }

    public void viewSubjectsByCourse(int courseId) {
        dao.getSubjectsByCourse(courseId);
    }
}
