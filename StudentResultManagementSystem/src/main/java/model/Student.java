package model;

public class Student {

    private int studentId;
    private String name;
    private int courseId;  

    public Student(int studentId, String name, int courseId) {
        this.studentId = studentId;
        this.name = name;
        this.courseId = courseId;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getCourseId() { return courseId; }

    
}

