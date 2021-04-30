import java.text.DecimalFormat;

public class Grad extends Student{
    private final double COST_PER_CREDIT=713;
    private String researchArea;


    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String research) {
        researchArea = research;
    }
    public double calcTuition(){
        return getNumCredits()*COST_PER_CREDIT;
    }
    @Override
    public String toString() {
        return super.toString()+"\nResearch Area: "+getResearchArea()
                +"\nTuition: $"+String.format("%.2f",calcTuition());
    }

}
