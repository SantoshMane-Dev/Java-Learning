package StudentAcademicManagementSystem.Service;

import StudentAcademicManagementSystem.Model.Student;
import StudentAcademicManagementSystem.Model.Subject;
import java.util.Scanner;

public class EnrollmentManager {

    private StudentManager studentManager;
    private SubjectManager subjectManager;

    public EnrollmentManager(StudentManager studentManager, SubjectManager subjectManager) {
        this.studentManager = studentManager;
        this.subjectManager = subjectManager;
    }

    public void enrollStudentToSubject(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        Student student = studentManager.findStudentById(studentId);

        if (student == null) {
            System.out.println("\nStudent Not Found!");
            return;
        }

        System.out.print("Enter Subject Code: ");
        String subjectCode = sc.nextLine();
        Subject subject = subjectManager.findSubjectByCode(subjectCode);

        if (subject == null) {
            System.out.println("\nSubject Not Found!");
            return;
        }
        student.enrollSubject(subject);
    }

    public void viewStudentSubjects(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        Student student = studentManager.findStudentById(studentId);
        if (student == null) {
            System.out.println("\nStudent Not Found!");
            return;
        }
        student.viewEnrolledSubjects();
    }

    public void addMarks(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        Student student = studentManager.findStudentById(studentId);
        if (student == null) {
            System.out.println("\nStudent Not Found!");
            return;
        }
        System.out.print("Enter Subject Code: ");
        String subjectCode = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        student.addMarks(subjectCode, marks);
    }

    public void viewResult(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        Student student = studentManager.findStudentById(studentId);
        if (student == null) {
            System.out.println("\nStudent Not Found!");
            return;
        }
        student.viewResult();
    }

}