package com.project;

import java.util.Scanner;

import model.Student;
import model.Subjects;
import model.Course;
import service.ResultService;

import service.StudentService;
import service.CourseService;
import service.SubjectService;
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        SubjectService subjectService= new SubjectService();
        ResultService resultService = new ResultService();

        while (true) {
            System.out.println("\n----- Student Result Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.println("4. Add Course");
            System.out.println("5. View Courses");
            System.out.println("6. Add Subject");
            System.out.println("7. View Subjects");
            System.out.println("8. Add Marks");
            System.out.println("9. View Report Card");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Enter Course ID (Must exist in Course table): ");
                    int courseId = sc.nextInt();

                    studentService.addStudent(new Student(sid, sname, courseId));
                    break;

                case 2:
                    studentService.getAllStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                case 4:
                    System.out.print("Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course Name: ");
                    String cname = sc.nextLine();

                    System.out.print("Duration: ");
                    String duration = sc.nextLine();

                    courseService.addCourse(new Course(cid, cname, duration));
                    break;

                case 5:
                    courseService.getAllCourses();
                    break;
                    
                case 6:
                    System.out.print("Subject ID: ");
                    int subId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course ID: ");
                    int subCourseId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Subject Name: ");
                    String subName = sc.nextLine();

                    subjectService.addSubject(new Subjects(subId, subCourseId, subName));
                    break;

                case 7:
                    System.out.print("Enter Course ID to view subjects: ");
                    int viewCourseId = sc.nextInt();

                    subjectService.viewSubjectsByCourse(viewCourseId);
                    break;
                case 8:
                    System.out.print("Student ID: ");
                    int rStud = sc.nextInt();

                    System.out.print("Subject ID: ");
                    int rSub = sc.nextInt();

                    System.out.print("Marks: ");
                    int marks = sc.nextInt();

                    resultService.addMarks(rStud, rSub, marks);
                    break;
                case 9:
                    System.out.print("Enter Student ID to view Report Card: ");
                    int rrStud = sc.nextInt();

                    resultService.viewReportCard(rrStud);
                    break;


                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
