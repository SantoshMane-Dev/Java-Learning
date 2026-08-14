package StudentAcademicManagementSystem.Service;

import StudentAcademicManagementSystem.Model.*;
import java.util.Scanner;

public class SubjectManager {

    private Subject[] subjects;
    private int subjectCount;

    public SubjectManager() {
        subjects = new Subject[100];
        subjectCount = 0;
    }

    public void addSubject(Scanner sc) {

        System.out.print("1. Enter Subject Code: ");
        String subjectCode = sc.nextLine();

        System.out.print("2. Enter Subject Name: ");
        String subjectName = sc.nextLine();

        System.out.print("3. Enter Maximum Marks: ");
        int maxMarks = sc.nextInt();
        sc.nextLine();

        if (subjectCount >= 100) {
            System.out.println("\nList Is Full");
            return;
        }

        Subject subject = new Subject(subjectCode, subjectName, maxMarks);
        subjects[subjectCount] = subject;
        subjectCount++;

        System.out.println("\nSubject Added Successfully. ");
    }

    public void viewSubjects() {
        if (subjectCount == 0) {
            System.out.println("\nSubject Not Found");
        } else {
            int i = 0;
            System.out.println("\n---------- Subject's Details ----------");
            while (i < subjectCount) {
                System.out.println("1. Subject Code   : " + subjects[i].getSubjectCode());
                System.out.println("2. Subject Name   : " + subjects[i].getSubjectName());
                System.out.println("3. Subject Marks  : " + subjects[i].getMaxMarks());
                System.out.println("--------------------------------------");
                i++;
            }
        }
    }

    public void searchSubject(Scanner sc) {
        System.out.print("Enter Subject Code For Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].getSubjectCode().equalsIgnoreCase(search)) {

                System.out.println("\n---------- Subject Details ----------");
                System.out.println("Code      : " + subjects[i].getSubjectCode());
                System.out.println("Name    : " + subjects[i].getSubjectName());
                System.out.println("Marks     : " + subjects[i].getMaxMarks());
                System.out.println("--------------------------------------");

                found = true;
            }
        }
        if (!found) {
            System.out.println("\nSubject Not Found!");
        }
    }

    public Subject findSubjectByCode(String code) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i].getSubjectCode().equalsIgnoreCase(code)) {
                return subjects[i];
            }
        }
        return null;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public void addSubjectFromFile(String code, String name, int maxMarks) {
        Subject subject = new Subject(code, name, maxMarks);
        subjects[subjectCount] = subject;
        subjectCount++;
    }
}
