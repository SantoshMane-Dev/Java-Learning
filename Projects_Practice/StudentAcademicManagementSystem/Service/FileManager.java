package StudentAcademicManagementSystem.Service;

import StudentAcademicManagementSystem.Model.Student;
import StudentAcademicManagementSystem.Model.Subject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void saveStudents(Student[] students, int studentCount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Students.txt"))) {
            writer.write("ID   | NAME            | AGE | COURSE");
            writer.newLine();
            writer.write("-----------------------------------------------");
            writer.newLine();
            for (int i = 0; i < studentCount; i++) {
                Student student = students[i];
                writer.write(
                        String.format(
                                "%-4d | %-15s | %-3d | %s",
                                student.getStudentId(),
                                student.getName(),
                                student.getAge(),
                                student.getCourse()));
                writer.newLine();
            }
            System.out.println("\nStudents Saved Successfully.");
        } catch (IOException e) {
            System.out.println("Error Saving Students: " + e.getMessage());
        }
    }

    public void saveSubjects(Subject[] subjects, int subjectCount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Subjects.txt"))) {
            writer.write("CODE  | SUBJECT NAME         | MAX MARKS");
            writer.newLine();
            writer.write("-----------------------------------------------");
            writer.newLine();
            for (int i = 0; i < subjectCount; i++) {
                Subject subject = subjects[i];
                writer.write(
                        String.format(
                                "%-5s | %-20s | %-9d",
                                subject.getSubjectCode(),
                                subject.getSubjectName(),
                                subject.getMaxMarks()));
                writer.newLine();
            }
            System.out.println("\nSubjects Saved Successfully.");
        } catch (IOException e) {
            System.out.println("Error Saving Subjects: " + e.getMessage());
        }
    }

    public void loadStudents(StudentManager manager) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Students.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber <= 2) {
                    continue;
                }
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] data = line.split("\\|");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                String course = data[3].trim();
                manager.addStudentFromFile(
                        id,
                        name,
                        age,
                        course);
            }

        } catch (IOException e) {
            System.out.println("\nNo student data found.");
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid student data in file.");
        }
    }

    public void loadSubjects(SubjectManager manager) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Subjects.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber <= 2) {
                    continue;
                }
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] data = line.split("\\|");
                String code = data[0].trim();
                String name = data[1].trim();
                int maxMarks = Integer.parseInt(data[2].trim());
                manager.addSubjectFromFile(
                        code,
                        name,
                        maxMarks
                );
            }

        } catch (IOException e) {
            System.out.println("\nNo subject data found.");
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid subject data in file.");
        }
    }
}
