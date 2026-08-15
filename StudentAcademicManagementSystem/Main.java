package StudentAcademicManagementSystem;

import StudentAcademicManagementSystem.Service.EnrollmentManager;
import StudentAcademicManagementSystem.Service.FileManager;
import StudentAcademicManagementSystem.Service.StudentManager;
import StudentAcademicManagementSystem.Service.SubjectManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        SubjectManager subManager = new SubjectManager();
        EnrollmentManager enrollManager = new EnrollmentManager(manager, subManager);
        FileManager fileManager = new FileManager();
        fileManager.loadStudents(manager);
        fileManager.loadSubjects(subManager);

        while (true) {
            System.out.println("\n========================================");
            System.out.println("\t STUDENT ACADEMIC SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Subject");
            System.out.println("7. View Subjects");
            System.out.println("8. Search Subject");
            System.out.println("9. Enroll Student in Subject");
            System.out.println("10. View Student Subjects");
            System.out.println("11. Add Marks");
            System.out.println("12. View Result");

            System.out.println("0. Exit");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice: ");
            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nPlease enter a valid number!");
                sc.nextLine();
                continue;
            }

            if (choice == 0) {

                fileManager.saveStudents(
                        manager.getStudents(),
                        manager.getStudentCount());

                fileManager.saveSubjects(
                        subManager.getSubjects(),
                        subManager.getSubjectCount());

                System.out.println("Exiting Student Academic System. Goodbye!");
                break;
            }

            switch (choice) {
                case 1: {
                    manager.addStudent(sc);
                    break;
                }
                case 2: {
                    manager.viewStudents();
                    break;
                }
                case 3: {
                    manager.searchStudent(sc);
                    break;
                }
                case 4: {
                    manager.updateStudent(sc);
                    break;
                }
                case 5: {
                    manager.removeStudent(sc);
                    break;
                }
                case 6: {
                    subManager.addSubject(sc);
                    break;
                }
                case 7: {
                    subManager.viewSubjects();
                    break;
                }
                case 8: {
                    subManager.searchSubject(sc);
                    break;
                }
                case 9: {
                    enrollManager.enrollStudentToSubject(sc);
                    break;
                }
                case 10: {
                    enrollManager.viewStudentSubjects(sc);
                    break;
                }
                case 11: {
                    enrollManager.addMarks(sc);
                    break;
                }
                case 12: {
                    enrollManager.viewResult(sc);
                    break;
                }
                default: {
                    System.out.println("\nInvalid choice!");
                    break;
                }
            }
        }
        sc.close();
    }
}

// remains exceptions
// subject updation, removation remains
