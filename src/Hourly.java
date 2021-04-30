
public class Hourly implements Company{

    private static final int STANDARD_HOURS = 40;
    private static final double OVERTIME = 1.5;
    private String name;
    private String ssn;
    private double hourlyRate;
    private double avgHoursPerWeek;

    public Hourly(){//constructor
        name="";
        ssn="";
        hourlyRate=0;
        avgHoursPerWeek=0;
    }
    public Hourly (String name,String ssn,double hourlyRate,double avgHoursPerWeek){//Parameterized constructor t
        this.name=name;
        this.ssn=ssn;
        this.hourlyRate=hourlyRate;
        this.avgHoursPerWeek=avgHoursPerWeek;
    }

    public void setPay(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }
    public double calcAnnualPay(){
        return hourlyRate * STANDARD_HOURS * WEEKS;
    }
    public double calcWeeklyPay(){
        if (avgHoursPerWeek <= STANDARD_HOURS)
            return avgHoursPerWeek * hourlyRate;
        return (STANDARD_HOURS * hourlyRate) +((avgHoursPerWeek - STANDARD_HOURS) * hourlyRate * OVERTIME);
    }
    public String toString(){
        return String.
                format("Name: \t%s%nSSN: \t%s%n\tAverage Hours worked:\t%10.2f%n\tHourly Rate:\t\t $%10.2f%n\tAverage Weekly Pay:\t $%10.2f%n\tAverage Annual Pay:\t $%10.2f",
                        name, ssn, avgHoursPerWeek, hourlyRate, calcWeeklyPay(),calcAnnualPay());
    }
}
