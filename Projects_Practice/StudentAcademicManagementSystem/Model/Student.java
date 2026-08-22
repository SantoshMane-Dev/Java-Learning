package StudentAcademicManagementSystem.Model;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;
    private Enrollment[] enrollments;
    private int enrollmentCount;

    public Student(String name, int age, String course) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter Valid Name!");
        } else {
            this.name = name.trim();
        }

        if (age > 6 && age < 30) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Enter Valid Age!");
        }

        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Enter Valid Course!");
        } else {
            this.course = course.trim();
        }

        enrollments = new Enrollment[10];
        enrollmentCount = 0;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void enrollSubject(Subject subject) {
        for (int i = 0; i < enrollmentCount; i++) {
            if (enrollments[i].getSubject().getSubjectCode()
                    .equalsIgnoreCase(subject.getSubjectCode())) {
                System.out.println("\nStudent Already Enrolled In This Subject!");
                return;
            }
        }
        if (enrollmentCount >= enrollments.length) {
            System.out.println("\nEnrollment List Is Full!");
            return;
        }
        enrollments[enrollmentCount] = new Enrollment(subject);
        enrollmentCount++;
        System.out.println("\nSubject Enrolled Successfully.");
    }

    public void viewEnrolledSubjects() {

        if (enrollmentCount == 0) {
            System.out.println("\nNo Subjects Enrolled!");
            return;
        }
        System.out.println("\n---------- Enrolled Subjects ----------");
        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(
                    enrollments[i].getSubject().getSubjectCode()
                            + " - "
                            + enrollments[i].getSubject().getSubjectName());
        }
        System.out.println("---------------------------------------");
    }

    public void addMarks(String subjectCode, double marks) {
        for (int i = 0; i < enrollmentCount; i++) {
            if (enrollments[i].getSubject().getSubjectCode()
                    .equalsIgnoreCase(subjectCode)) {
                if (marks < 0 || marks > enrollments[i].getSubject().getMaxMarks()) {
                    System.out.println("\nInvalid Marks!");
                    return;
                }
                enrollments[i].setMarks(marks);
                System.out.println("\nMarks Added Successfully.");
                return;
            }
        }
        System.out.println("\nSubject Not Enrolled!");
    }

    public void viewResult() {
        if (enrollmentCount == 0) {
            System.out.println("\nNo Subjects Enrolled!");
            return;
        }
        double totalMarks = 0;
        double totalMaxMarks = 0;
        System.out.println("\n---------- Student Result ----------");
        for (int i = 0; i < enrollmentCount; i++) {
            Enrollment enrollment = enrollments[i];
            System.out.println(
                    enrollment.getSubject().getSubjectName()
                            + " : "
                            + enrollment.getMarks()
                            + " / "
                            + enrollment.getSubject().getMaxMarks());
            totalMarks += enrollment.getMarks();
            totalMaxMarks += enrollment.getSubject().getMaxMarks();
        }
        double percentage = (totalMarks / totalMaxMarks) * 100;
        System.out.println("\n------------------------------------");
        System.out.println("Total Marks : " + totalMarks + " / " + totalMaxMarks);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("------------------------------------");
    }

}
