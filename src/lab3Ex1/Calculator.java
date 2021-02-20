package lab3Ex1;

import java.util.Scanner;

public class Calculator {

    private double Accumulator = 0.0;

    public Calculator() {
    }

    //// Getter & Setter /////
    public double getAccumulator() {
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
        this.Accumulator = this.Accumulator / x;
    }

    public String tostring(){return String.valueOf(getAccumulator());}

    //// Calculator /////
    public static void main(String[] args) {
        Calculator y = new Calculator();
        System.out.println("------- Calculator ------");
        boolean leave = true;
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Operation");
        System.out.println(
                """
                        1 : Addition
                        2 : Subtraction
                        3 : Multiplication
                        4 : Division
                        5 : Exit """
        );
        int choice = scan.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter Value: ");
                y.add(scan.nextDouble());
                System.out.println("\n\n" + y.tostring());
                break;
            case 2:
                System.out.print("Enter Value: ");
                y.subtract(scan.nextDouble());
                System.out.println("\n\n" + y.tostring());
                break;
            case 3:
                System.out.print("Enter Value: ");
                y.multiply(scan.nextDouble());
                System.out.println("\n\n" + y.tostring());
                break;
            case 4:
                boolean check = true;
                do {
                    System.out.print("Enter Value: ");
                    double input = scan.nextDouble();
                    if(input == 0 || input == 0.0){
                        System.out.println("Invalid Input, Input must be > 0 for Division");
                    }else{
                        y.divide(input);
                        check = false;
                    }
                } while (check);
                System.out.println("\n\n" + y.tostring());
                break;
            case 5:
                leave = false;
                break;
        }
    }while(leave);
    }
}
