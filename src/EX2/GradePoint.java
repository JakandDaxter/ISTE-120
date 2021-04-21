package EX2;

public class GradePoint {

    private int sumCredits;
    private int sumWeightedPoints;

public enum Grade {

    A(4, 'A', 'a'),
    B(3, 'B', 'b'),
    C(2, 'C', 'c'),
    D(1, 'D', 'd'),
    F(0, 'F', 'f');

    int code;
    char desc1;
    char desc2;

    Grade(int code, char desc1, char desc2) {
        this.code = code;
        this.desc1 = desc1;
        this.desc2 = desc2;
    }

    public static int calcPoints(char desc) {
        for (Grade m : Grade.values()) {
            if (m.desc1 == desc) {
                return m.code;
            }
            if (m.desc2 == desc) {
                return m.code;
            }
        }
        return -1;
    }

}

    public GradePoint() {
    sumCredits = 0;
    sumWeightedPoints = 0;
    }

    public int getSumCredits() {
        return sumCredits;
    }

    public int getSumWeightedPoints() {
        return sumWeightedPoints;
    }

    public void addToTotals(char grade, int credits){
        sumCredits= credits + sumCredits;
        sumWeightedPoints = Grade.calcPoints(grade)*credits + sumWeightedPoints;

    }

    public double calcGPA(){
        return (double) sumWeightedPoints/(double) sumCredits;
    }

    public String print(){

        return "Sum Points: " + sumWeightedPoints + " Sum Credits: " + sumCredits;
    }
}
