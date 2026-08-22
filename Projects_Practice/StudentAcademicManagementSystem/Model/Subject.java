package StudentAcademicManagementSystem.Model;

public class Subject {
    private String subjectCode;
    private String subjectName;
    private int maxMarks;

    public Subject(String subjectCode, String subjectName, int maxMarks) {

        if (subjectCode == null || subjectCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Subject Code!");
        } else {
            this.subjectCode = subjectCode.trim();
        }

        if (subjectName == null || subjectName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Subject Name!");
        } else {
            this.subjectName = subjectName.trim();
        }

        if (maxMarks <= 0) {
            throw new IllegalArgumentException("Invalid Max Marks!");
        } else {
            this.maxMarks = maxMarks;
        }
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

}
