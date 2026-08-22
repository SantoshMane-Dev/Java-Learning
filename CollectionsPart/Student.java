package CollectionsPart;

public class Student {

    private int studentId;
    private String studentName;
    private int age;
    private String course;

    public Student(String studentName, int age, String course) {

        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student Name Is Invalid");
        }
        this.studentName = studentName.trim();

        if (age < 6 || age > 30) {
            throw new IllegalArgumentException("Age Should Be Between 6 to 30");
        }
        this.age = age;

        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course Name Is Invalid");
        }
        this.course = course.trim();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
}