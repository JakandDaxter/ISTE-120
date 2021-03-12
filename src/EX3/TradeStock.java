package EX3;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * EX2.TradeStock - class to exercise the EX2.Stock class.
 * @author  D. Patric (adapted from J. Leone/R. Niemi)
 * @version 2205
 */

public class TradeStock {
   public static void main(String[] args) {
      // declarations
      Stock myStock = new Stock();
      Scanner in = new Scanner(System.in);
      String name;   //Name of stock
      String symbol; //Symbol of stock
      double price;  //price per share of stock
      int shares;    //number of shares of stock

      // instantiate EX2.Stock object with price and symbol
      do{
         System.out.print("Enter name of stock: ");
         name = in.nextLine();
         if(!myStock.setName(name)){System.out.println("Invalid Input - Must have at least one character"); exit(0);}
      }while(!myStock.setName(name));

      do{
         System.out.print("Enter symbol of stock: ");
         symbol = in.nextLine();
         if(!myStock.setSymbol(symbol)){System.out.println("Invalid Input - Must be between 3 and 6 characters, inclusively."); exit(0);}
      }while(!myStock.setSymbol(symbol));

      
      // prompt user for price and set it
      do{
         System.out.print("Enter price of stock: ");
         price = in.nextDouble();
         if(!myStock.setPrice(price)){System.out.println("Invalid Input - Must be greater than 0.0."); exit(0);}
      }while(!myStock.setPrice(price));

      
      // prompt user for number of shares and set it
      do{
         System.out.print("Enter number of shares: ");
         shares = in.nextInt();
         if(!myStock.setShares(shares)){System.out.println("Must be between 10 and 1000, inclusively and be a multiple of 10."); exit(0);}
      }while(!myStock.setShares(shares));

      
      // print stock info using spaces with each output
      System.out.printf("%nName:   %s%n", myStock.getName());
      System.out.printf("Symbol: %s%n", myStock.getSymbol());
      System.out.printf("Price:  %.2f%n", myStock.getPrice());
      System.out.printf("Shares: %d%n", myStock.getShares());
      play(myStock);

   }

   public static void play(Stock myStock){
      Scanner scan = new Scanner(System.in);
      System.out.print("""
              \nOptions as single upper or lower case character
              B to buy the stock
              S to sell the stock
              Any other to exit""");
      scan.reset();
      String choice = scan.nextLine();
      String patternB = "[bB]{1}";
      String patternS = "[sS]{1}";
      if(choice.matches(patternB)){myStock.buy();}else if(choice.matches(patternS)){myStock.sell();}else{exit(0);}
   }



}