import java.text.DecimalFormat;

public class Undergrad extends Student{
    private int yearLevel;
    private final double COST_PER_CREDIT=517;
    public int getYearLevel() {
        return yearLevel;
    }

    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public void setYearLevel(int Level) {
        this.yearLevel = Level;
    }

    public Undergrad() {
        super();
    }

    public Undergrad(String name, String id, int numCredits,int level) {
        super(name, id, numCredits);
        this.yearLevel=level;
    }
    public double calcTuition(){
        return getNumCredits()*COST_PER_CREDIT;
    }
    public String toString(){
        return super.toString()+"\nYear Level: "+getYearLevel()+
                "\nTuition: $"+String.format("%.2f" , calcTuition());
    }


}