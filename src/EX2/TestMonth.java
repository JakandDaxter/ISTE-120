package EX2;

import java.util.Scanner;

public class TestMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the month number (1 - 12): ");


        try{
        System.out.println("The month is: " + Month.parse(scan.nextInt()).getDesc());
        }catch(NullPointerException e)
        {
            System.out.println("Invalid Input");
        }
    }
}
