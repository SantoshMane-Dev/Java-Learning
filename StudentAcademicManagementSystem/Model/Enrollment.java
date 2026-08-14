package StudentAcademicManagementSystem.Model;

public class Enrollment {

    private Subject subject;
    private double marks;

    public Enrollment(Subject subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Subject cannot be null!");
        }
        this.subject = subject;
        this.marks = 0;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > subject.getMaxMarks()) {
            throw new IllegalArgumentException("Invalid Marks!");
        }

        this.marks = marks;
    }
}