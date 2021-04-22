package Exercise3;

public class Course {

    private int credits;
    private String grade;

    public Course(int credits, String grade) {
        this.credits = credits;
        this.grade = grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
