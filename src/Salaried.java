public class Salaried implements Company{//class Salaried
    private static final double DEDUCTION = 125.50;
    private String name;
    private String ssn;
    private double annualSalary;

    public Salaried(){
        name="";
        ssn="";
        annualSalary=0;
    }
    public Salaried (String name,String ssn,double annualSalary){
        this.name = name;
        this.ssn = ssn;
        this.annualSalary = annualSalary;
    }
    public void setPay (double p){
        annualSalary = p;
    }
    public double calcAnnualPay (){
        return annualSalary - WEEKS * DEDUCTION;
    }
    public double calcWeeklyPay (){
        return annualSalary / WEEKS - DEDUCTION;
    }
    public String toString (){
        return String.
                format
                        ("Name: \t%s%nSSN: \t%s%n\tAnnual salary:\t\t$%10.2f%n\tAnnual Pay:\t\t$%10.2f%n\tWeekly Pay:\t\t$%10.2f",
                                name, ssn, annualSalary, calcAnnualPay (), calcWeeklyPay ());
    }
}


