package CashRegister;

import java.util.ArrayList;
import java.util.Scanner;

public class RunCashRegister {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Welcome to the Store");
      System.out.println("---------------------");
      System.out.println();
      System.out.println(
              "1 : Make a Purchase\n\n" +
              "2 : Exit Store"
      );
      System.out.println();
      System.out.print("Chose an Activity By Entering The Associated Number: ");
      int choice = scan.nextInt();
      switch(choice){
         case 1:
            purchase();
            break;
         case 2:
            break;
      }

   }

   public static void purchase(){
      boolean con = true;
      String choice;
      Scanner scan = new Scanner(System.in);
      ArrayList<Double> list = new ArrayList<Double>();
      do{
         System.out.print("Enter Amount of Item: ");
         list.add(scan.nextDouble());
         System.out.print("\n\n Do You Wish To Purchase Another Item? (y,n) : ");
         choice = scan.next();
         if (choice.equals("n")) {con = false;}
      }while(con);

   }

}
