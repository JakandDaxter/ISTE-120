package lab3Ex2;

import java.util.Scanner;

public class ComplexCalculator {

    private double Accumulator = 0.0;


    //// Getter & Setter /////
    public Double getAccumulator() {
        return Accumulator;
    }

    public void clear() {
        Accumulator = 0.0;
    }

    //// Mods /////
    public void add(Double x){
        this.Accumulator = x + this.Accumulator;
    }
    public void subtract(Double x){
        this.Accumulator = this.Accumulator - x;
    }

    public void multiply(Double x){
        this.Accumulator = x * this.Accumulator;
    }

    public void divide(Double x){
        if(x == 0 && getAccumulator() == 0){this.Accumulator = 0;}
        this.Accumulator = this.Accumulator / x;
    }

    public String tostring(){return String.valueOf(getAccumulator());}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // slope //

        double x1 = 2.0;
        double x2 = 4.0;
        double y1 = 2.0;
        double y2 = 4.0;

        //the obects of the class
        ComplexCalculator Denominator = new ComplexCalculator();
        ComplexCalculator Numerator = new ComplexCalculator();

        // x2 - x1
        Denominator.add(x2);
        Denominator.subtract(x1);

        // y2 - y1
        Numerator.add(y2);
        Numerator.subtract(y1);

        Numerator.divide(Denominator.getAccumulator());

        System.out.println("The Slope Is : " + Numerator.getAccumulator());

        ///// BMI ComplexCalculator ////
        ComplexCalculator top = new ComplexCalculator();
        ComplexCalculator bot = new ComplexCalculator();

        //Constant
        top.add(703.0);

        //Get Weight
        System.out.print(" Enter Weight : ");
        top.multiply(scan.nextDouble());

        System.out.print("Enter Height : ");
        //get Height and add it to the bottom
        bot.add(scan.nextDouble());

        //square the value
        bot.multiply(bot.getAccumulator());

        //divide top by bottom
        top.divide(bot.getAccumulator());
        System.out.print("\nYour BMI Is : " + top.getAccumulator());

    }
}
