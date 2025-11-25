package service;

import dao.CourseDAO;
import model.Course;

public class CourseService{

    private CourseDAO dao = new CourseDAO();

    public void addCourse(Course c) {
        dao.addCourse(c);
    }

    public void getAllCourses() {
        dao.getAllCourses();
    }
}
