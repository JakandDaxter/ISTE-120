package EX3;

import org.jetbrains.annotations.NotNull;

/**
 * EX2.Stock - class to emulate corporate stocks.
 * @author  D. Patric (adapted from J. Leone/R. Niemi)
 * @version 2205
 */

public class Stock {
   private String name;    //name of company
   private String symbol;  //Symbol of company on EX2.Stock Exchange
   private double price;   //price per share
   private int shares;     //number of shares
   private double valueShares; //value of the shares
   private final double RATE = 0.01; //constant rate
   private final double COMMISSION = 500;

   /**
    * Constructor with name and symbol
    */
   public Stock(String _name, String _symbol) {
      name = _name;
      symbol = _symbol;
      price  = 0.0;
      shares = 0;
   }

   /**
    * Constructor with name and symbol
    */
   public Stock() {
      name = "";
      symbol = "";
      price  = 0.0;
      shares = 0;
   }

   
   /**
    * Get name of stock
    * @return name of stock
    */
   public String getName() {
      return name;
   }
   
   /**
    * Get symbol of stock
    * @return symbol of stock
    */
   public String getSymbol() {
      return symbol;
   }
   
   /**
    * Get price of stock
    * @return price of stock
    */
   public double getPrice() {
      return price;
   }
   
   /**
    * Get number of shares
    * @return number of shares
    */
   public int getShares() {
      return shares;
   }
   
   /**
    * Set price of shares
    * @param newPrice price of shares
    */
   public boolean setPrice(@NotNull double newPrice) {
      if(newPrice>0.0){
         price = newPrice;
         return true;
      }
      return false;
   }
   
   /**
    * Set number of shares
    * @param newShares number of shares
    */
   public boolean setShares(@NotNull int newShares) {
      if(newShares>=10 && newShares<=1000 && newShares%10==0){
         shares = newShares;
         return true;
      }
      return false;
   }


   /**
    * Set name of stock
    * @param name name of stock
    */
   public boolean setName(@NotNull String name) {
      String pattern = "[aA-zZ]+";
      if(name.matches(pattern)){
         this.name = name;
         return true;
      }
      return false;
   }

   /**
    * Set symbol of stock
    * @param symbol of stock
    */
   public boolean setSymbol(@NotNull String symbol) {
      String pattern = "[aA-zZ]{3,6}";
      if(symbol.matches(pattern)){
         this.symbol = symbol;
         return true;
      }
      return false;
   }

   /**
    * Return total value of stock as type
    * double.
    */
   public double calcValue(){
      valueShares = price*shares;
      return valueShares;}

   /**
    * Return cost of commission as type double.
    */
   public double calcCommission(){
      double value = valueShares*RATE;
      if(value>COMMISSION){return COMMISSION;}
      return value;
   }

   public void buy(){
      calcValue();
      System.out.print("\nCost of Shares: " + valueShares);
      System.out.print("\nCommission: " + calcCommission());
      System.out.print("\nTotal Cost: " +(calcValue()+calcCommission()));
   };

   public void sell(){
      calcValue();
      System.out.print("\nCost of Shares: " + valueShares);
      System.out.print("\nCommission: " + calcCommission());
      System.out.print("\nTotal Cost: " + (calcValue() - calcCommission()));
   };
}