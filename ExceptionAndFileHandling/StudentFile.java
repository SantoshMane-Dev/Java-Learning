package ExceptionAndFileHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class StudentFile {
    public static void main(String[] args) {

        File f1 = new File("Student.txt");
        Scanner sc = new Scanner(System.in);

        if (f1.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            System.out.println("\n========== Student Record Manager ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Backup Records");
            System.out.println("4. File Information");
            System.out.println("5. Exit");
            System.out.println("============================================");

            System.out.print("Choose Option: ");
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice < 1 || choice > 5) {
                    throw new IllegalArgumentException("\nInvalid menu option. Please choose between 1 and 5.");
                }

                if (choice == 5) {
                    System.out.println("Thanks For Visiting...");
                    break;
                }

                switch (choice) {
                    case 1 -> addStudent(sc);
                    case 2 -> viewStudent();
                    case 3 -> backupRecords();
                    case 4 -> fileInfo();
                }
            } catch (InputMismatchException e) {
                System.out.println("\n------------Invalid Input!----------------");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    static void addStudent(Scanner sc) {
        System.out.print("\nEnter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt", true))) {

            bw.write("Name : " + name);
            bw.newLine();

            bw.write("Age  : " + age);
            bw.newLine();

            bw.write("---------------------");
            bw.newLine();

            System.out.println("\n------------Student Details Added Successfully.------------------");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void viewStudent() {

        try (BufferedReader b1 = new BufferedReader(new FileReader("Student.txt"))) {
            String line;

            System.out.println();
            while ((line = b1.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void backupRecords() {

        try (FileInputStream first = new FileInputStream("Student.txt");
                FileOutputStream last = new FileOutputStream("Chattra.txt")) {
            int data;
            while ((data = first.read()) != -1) {
                last.write(data);
            }
            System.out.println("Backup Created Successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void fileInfo() {
        File myFile = new File("Student.txt");

        System.out.println("\n=============== File Information ==================");
        System.out.println("Name      : " + myFile.getName());
        System.out.println("Path      : " + myFile.getAbsolutePath());
        System.out.println("Size      : " + myFile.length());
        System.out.println("Readable  : " + myFile.canRead());
        System.out.println("Writtable : " + myFile.canWrite());
        System.out.println("Exists    : " + myFile.exists());
        System.out.println("====================================================");

    }
}
