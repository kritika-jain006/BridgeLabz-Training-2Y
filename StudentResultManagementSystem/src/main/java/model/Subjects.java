package model;

public class Subjects {
    private int subjectId;
    private int courseId;
    private String subjectName;

    public Subjects(int subjectId, int courseId, String subjectName) {
        this.subjectId = subjectId;
        this.courseId = courseId;
        this.subjectName = subjectName;
    }

    public int getSubjectId() { return subjectId; }
    public int getCourseId() { return courseId; }
    public String getSubjectName() { return subjectName; }
}
