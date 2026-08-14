package StudentAcademicManagementSystem.Service;

import StudentAcademicManagementSystem.Model.*;
import java.util.Scanner;

public class StudentManager {

    private Student[] students;
    private int studentCount;

    public StudentManager() {
        students = new Student[100];
        studentCount = 0;
    }

    public void addStudent(Scanner sc) {

        System.out.print("\nEnter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        if (studentCount >= 100) {
            System.out.println("\nList Is Full!");
            return;
        }
        Student student = new Student(name, age, course);
        student.setStudentId(studentCount + 1);
        students[studentCount] = student;
        studentCount++;

        System.out.println("\n---Student Added Successfully.");
    }

    public void viewStudents() {
        if (studentCount == 0) {
            System.out.println("No Student Found!");
        } else {
            int i = 0;
            System.out.println("\n---------- Student Details ----------");
            while (i < studentCount) {
                System.out.println("ID      : " + students[i].getStudentId());
                System.out.println("Name    : " + students[i].getName());
                System.out.println("Age     : " + students[i].getAge());
                System.out.println("Course  : " + students[i].getCourse());
                System.out.println("--------------------------------------");
                i++;
            }
        }
    }

    public void searchStudent(Scanner sc) {
        System.out.print("Enter Student Id: ");
        int search = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == search) {
                System.out.println("\n---------- Student Details ----------");
                System.out.println("ID      : " + students[i].getStudentId());
                System.out.println("Name    : " + students[i].getName());
                System.out.println("Age     : " + students[i].getAge());
                System.out.println("Course  : " + students[i].getCourse());
                System.out.println("--------------------------------------");

                found = true;
            }
        }
        if (!found) {
            System.out.println("\nStudent Not Found!");
        }
    }

    public void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID: ");
        int stdId = sc.nextInt();

        int studentIndex = -1;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == stdId) {
                studentIndex = i;
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("\nStudent Not Found!");
            return;
        }

        while (true) {
            System.out.println("\n---------- Update Student ----------");
            System.out.println("1. Update Name");
            System.out.println("2. Update Age");
            System.out.println("3. Update Course");
            System.out.println("4. Cancel");
            System.out.println("-------------------------------------");
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

            if (choice == 4) {
                System.out.println("\nUpdate cancelled. No changes were made.");
                return;
            }

            switch (choice) {
                case 1: {

                    System.out.print("\nEnter New Name: ");
                    String name = sc.nextLine();

                    if (name == null || name.trim().isEmpty()) {
                        System.out.println("\n-----Invalid Input!");
                    } else {
                        students[studentIndex].setName(name.trim());
                        System.out.println("\nName Updated Successfully.");
                    }
                    break;
                }
                case 2: {
                    System.out.print("\nAge Should Between 6 To 30: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    if (age > 6 && age < 30) {
                        students[studentIndex].setAge(age);
                        System.out.println("\nAge Updated Successfully.");
                    } else {
                        System.out.println("\n---Enter Valid Age!");
                    }
                    break;
                }
                case 3: {
                    System.out.print("\nEnter New Course: ");
                    String course = sc.nextLine();
                    
                    if (course == null || course.trim().isEmpty()) {
                        System.out.println("\n-----Invalid Course!");
                    } else {
                        students[studentIndex].setCourse(course.trim());
                        System.out.println("\nCourse Updated Successfully.");
                    }
                    break;
                }
                default: {
                    System.out.println("\nEnter Valid Choice Options!");
                    break;
                }
            }
        }
    }

    public void removeStudent(Scanner sc) {

        System.out.print("Enter Student Id For Delete: ");
        int search = sc.nextInt();
        sc.nextLine();

        int studentIndex = -1;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getStudentId() == search) {
                studentIndex = i;

                System.out.print("Are you sure you want to remove this student? (Y/N): ");
                String confirmation = sc.nextLine();

                if (confirmation.equalsIgnoreCase("y")) {
                    i = studentIndex;
                    while (i < studentCount - 1) {
                        students[i] = students[i + 1];
                        i++;
                    }
                    studentCount--;
                    students[studentCount] = null;
                    System.out.println("\nStudent Removed Successfully.");

                } else {
                    System.out.println("\nDeletion Cancelled.");
                    return;
                }
                break;
            }
        }
        if (studentIndex == -1) {
            System.out.println("Student Not Found!");
            return;
        }

    }

    public Student findStudentById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == id) {
                return students[i];
            }
        }

        return null;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudentFromFile(int id, String name, int age, String course) {
        Student student = new Student(name, age, course);
        student.setStudentId(id);
        students[studentCount] = student;
        studentCount++;
    }
}
