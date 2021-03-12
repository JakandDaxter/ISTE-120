package EX1;

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
      Scanner in = new Scanner(System.in);
      String name;   //Name of stock
      String symbol; //Symbol of stock
      double price;  //price per share of stock
      int shares;    //number of shares of stock
      
      // get name and symbol
      do{
         System.out.print("Enter name of stock: ");
         name = in.nextLine();
         if(!validateName(name)){System.out.println("Invalid Input - Must have at least one character"); exit(0);}
      }while(!validateName(name));

      do{
         System.out.print("Enter symbol of stock: ");
         symbol = in.nextLine();
         if(!validateSymbol(symbol)){System.out.println("Invalid Input - Must be between 3 and 6 characters, inclusively."); exit(0);}
      }while(!validateSymbol(symbol));
      
      // instantiate EX2.Stock object with price and symbol
      Stock myStock = new Stock(name, symbol);
      
      // prompt user for price and set it
      do{
         System.out.print("Enter price of stock: ");
         price = in.nextDouble();
         if(!validatePrice(price)){System.out.println("Invalid Input - Must be greater than 0.0."); exit(0);}
      }while(!validatePrice(price));
      myStock.setPrice(price);

      
      // prompt user for number of shares and set it
      do{
         System.out.print("Enter number of shares: ");
         shares = in.nextInt();
         if(!validateShares(shares)){System.out.println("Must be between 10 and 1000, inclusively and be a multiple of 10."); exit(0);}
      }while(!validateShares(shares));
      myStock.setShares(shares);

      
      // print stock info using spaces with each output
      System.out.printf("%nName:   %s%n", myStock.getName());
      System.out.printf("Symbol: %s%n", myStock.getSymbol());
      System.out.printf("Price:  %.2f%n", myStock.getPrice());
      System.out.printf("Shares: %d%n", myStock.getShares());
   }

   public static boolean validateName(String name){
      String pattern = "[aA-zZ]+";

      return name.matches(pattern);
   }

   public static boolean validateSymbol(String symbol){
      String pattern = "[aA-zZ]{3,6}";
      return symbol.matches(pattern);
   }

   public static boolean validatePrice(double price){return price>0.0;};

   public static boolean validateShares(int stock){return stock>=10 && stock<=1000 && stock%10==0;};

}