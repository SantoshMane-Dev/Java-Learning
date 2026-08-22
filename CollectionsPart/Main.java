package CollectionsPart;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private final Set<Student> students = new HashSet<>();
    private int studentCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main app = new Main();
        while (true) {
            System.out.println("\n================ Students Menu ================");
            System.out.println("1. Add a student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Remove a student by ID");
            System.out.println("5. Update a student's Information");
            System.out.println("0. Exit From Menu");
            System.out.println("------------------ Menu End ---------------------");
            System.out.print("Enter Your Choice: ");
            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEntered Choice Must Be An Integer Value.");
                sc.nextLine();
                continue;
            }
            if (choice == 0) {
                System.out.println("\nGood Luck! Signing Out From Menu...");
                break;
            }
            switch (choice) {
                case 1 -> app.addStudent(sc);
                case 2 -> app.displayStudents();
                case 3 -> app.searchStudent(sc);
                case 4 -> app.removeStudent(sc);
                case 5 -> app.updateStudent(sc);
                default -> System.out.println("\nEnter Given Choices!");
            }
        }
        sc.close();
    }

    private void addStudent(Scanner sc) {

        System.out.print("\nEnter FullName  : ");
        String name = sc.nextLine();
        System.out.print("Enter Age       : ");
        int age;
        try {
            age = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("\nAge Should Be An Integer Value!");
            sc.nextLine();
            return;
        }
        System.out.print("Enter Course    : ");
        String course = sc.nextLine();
        Student student = new Student(name, age, course);
        studentCount++;
        student.setStudentId(studentCount);
        students.add(student);
        System.out.println("\nStudent Added Successfully.");
    }

    private void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo Student Added Yet.");
            return;
        }
        System.out.println("\n------------- Students -------------");
        for (Student student : students) {
            System.out.println("Student Code     : " + student.getStudentId());
            System.out.println("Student Name     : " + student.getStudentName());
            System.out.println("Student Age      : " + student.getAge());
            System.out.println("Student Course   : " + student.getCourse());
            System.out.println("------------------------------------");
        }
    }

    private void searchStudent(Scanner sc) {
        System.out.print("Enter Student Code For Search: ");
        int searchId;
        try {
            searchId = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Detail!");
            sc.nextLine();
            return;
        }
        for (Student student : students) {
            if (student.getStudentId() == searchId) {
                System.out.println("\n------------- Student Data -------------");
                System.out.println("Student Code     : " + student.getStudentId());
                System.out.println("Student Name     : " + student.getStudentName());
                System.out.println("Student Age      : " + student.getAge());
                System.out.println("Student Course   : " + student.getCourse());
                System.out.println("----------------------------------------");
                return;
            }
        }
        System.out.println("\nStudent Not Found!");
    }

    private void removeStudent(Scanner sc) {

        System.out.print("Enter Student Code For Removal: ");
        int removeId;
        try {
            removeId = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Detail!");
            sc.nextLine();
            return;
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == removeId) {
                iterator.remove();
                System.out.println("\nStudent Removed Successfully.");
                return;
            }
        }
        System.out.println("\nStudent Not Found!");
    }

    private void updateStudent(Scanner sc) {

        System.out.print("Enter Student Code For Update: ");
        int updateId;
        try {
            updateId = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Detail!");
            sc.nextLine();
            return;
        }
        for (Student student : students) {
            if (student.getStudentId() == updateId) {
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New Age: ");
                int age;
                try {
                    age = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Age Should Be An Integer Value!");
                    sc.nextLine();
                    return;
                }
                System.out.print("Enter New Course: ");
                String course = sc.nextLine();
                student.setStudentName(name);
                student.setAge(age);
                student.setCourse(course);
                System.out.println("\nStudent Updated Successfully.");
                return;
            }
        }
        System.out.println("\nStudent Not Found!");
    }
}