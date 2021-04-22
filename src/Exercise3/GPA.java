package Exercise3;

import java.util.ArrayList;

public class GPA {


    private ArrayList<Integer> credits;
    private ArrayList<String> grades;
    private int numCourses;

    public enum Grade {

        A(4, "A", "a"),
        B(3, "B", "b"),
        C(2, "C", "c"),
        D(1, "D", "d"),
        F(0, "F", "f");

        int code;
        String desc1;
        String desc2;

        Grade(int code, String desc1, String desc2) {
            this.code = code;
            this.desc1 = desc1;
            this.desc2 = desc2;
        }

        public static int calcPoints(String desc) {
            for (Grade m : Grade.values()) {
                if (m.desc1.equals(desc)) {
                    return m.code;
                }
                if (m.desc2.equals(desc)) {
                    return m.code;
                }
            }
            return -1;
        }

    }

    public GPA() {
        this.credits = new ArrayList<Integer>();
        this.grades = new ArrayList<String>();
        this.numCourses = 0;
    }

    public void addCourse(int cred, String grad){
        credits.add(cred);
        grades.add(grad);
        numCourses++;
    }

    public double calcGPA(){
        double sum = 0;
        double credSum = 0;

        for(int i = 0; i <=numCourses-1;i++){
            credSum += credits.get(i);
            sum += (Grade.calcPoints(grades.get(i)) * credits.get(i));
        }

        return sum/credSum;
    }
}
