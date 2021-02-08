package CashRegister;

import java.util.ArrayList;
import java.util.Scanner;
//    Name: Aliana Tejeda
//    Course: ISTE-120
//    HW: A class to test the CashRegister class
//
public class RunCashRegister {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Welcome to the Store");
      System.out.println("---------------------");
      System.out.println();
      System.out.println(
              """
                      1 : Make a Purchase

                      2 : Exit Store"""
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

   /*
      Allow the user to start another purchases
     with a new customer
    */
   public static void AnotherCustomer(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Would You Like To Make A Purchase?");
      System.out.println("---------------------");
      System.out.println();
      System.out.println(
              """
                      1 : Make a Purchase

                      2 : Exit Store"""
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
   /*
      Method to push the list of purchase into the
      purchase method from the CashRegister class
    */
   public static void purchase(){
      String choice;
      Scanner scan = new Scanner(System.in);
      ArrayList<Double> list = new ArrayList<Double>();
      do{
         System.out.print("\n\nEnter Amount of Item: ");
         list.add(scan.nextDouble());
         System.out.print("\n\nDo You Wish To Purchase Another Item? (y,n) : ");
         choice = scan.next();
      }while(!choice.equals("n"));
      receipt(list);
   }

   /*
      method to print the receipt and
      get the payment from the customer
    */
   public static void receipt(ArrayList<Double> items){
      Scanner scan = new Scanner(System.in);
      CashRegister g = new CashRegister();
      for (Double item : items) {
         g.recordPurchase(item); //push sales into object
      }
      System.out.print("Please Enter Payment: ");
      double payment = scan.nextDouble();
      g.enterPayment(payment);
      for(int i = 0;i < items.size(); i++){
         System.out.println("item #"+ i + "  sales price"+ "   $"+ items.get(i));
      }
      System.out.println("Customer paid amount   $" + payment);
      g.printReceipt();
      System.out.println();
      AnotherCustomer();
   }

}
