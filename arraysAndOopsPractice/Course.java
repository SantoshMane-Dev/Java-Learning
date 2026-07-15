package arraysAndOopsPractice;

public class Course {

    static int maxCapacity; 
    String courseName;
    int enrolments;
    String[] enrolledStudent;

    static {
        maxCapacity = 100;
    }

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolments = 0;
        this.enrolledStudent = new String[maxCapacity];
    }

    void enrollStudent(String studentName) {
        enrolledStudent[enrolments] = studentName;
        enrolments++;
        
    }

    void unEnrollStudent(String studentName) {
        System.out.println("Student Removed");
        
    }

    static void setMaxCapacity(int capacity){
        Course.maxCapacity = maxCapacity;
    }

 
    public static void main(String[] args) {

        Course c1 = new Course("c++");
        
    }
}
