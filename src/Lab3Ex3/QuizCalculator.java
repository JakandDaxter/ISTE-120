package Lab3Ex3;

import java.util.Scanner;

public class QuizCalculator {

    String name;
    int numQuizs;
    double sum;

    public QuizCalculator(String name) {
        this.name = name;
        this.numQuizs = 0;
        this.sum = 0;
    }

    // Methods //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumQuizs() {
        return numQuizs;
    }

    public void setNumQuizs(int numQuizs) {
        this.numQuizs = numQuizs;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void addScore(double newScore) {
        this.sum += newScore;
        this.numQuizs++;
    }

    public double getAverage(){
        return this.sum/this.numQuizs;
    }

    public String tostring(){
        return this.name + " quiz average: " + String.format("%6.2f",getAverage());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        QuizCalculator student = new QuizCalculator(name);
        student.addScore(45.90);
        student.addScore(67.66);
        student.addScore(89.78);
        System.out.println(student.tostring());

    }
}
