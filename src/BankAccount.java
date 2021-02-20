/**
 * BankAccount - Class to model a bank account, which has a balance that 
 * can be changed by deposits and withdrawals.
 *
 * @author <student's name here>
 * @version <today's date>
*/

public class BankAccount {   //Student Starter File
   private double balance;
   double TransFee;
   int NumFreeTrans;

   /**
    * Constructs a bank account with a zero balance
    */
   public BankAccount() {
      balance = 0;
   }

   /**
    * Constructs a bank account with a given balance
    * @param initialBalance the initial balance
    */
   public BankAccount(double initialBalance) {   
      balance = initialBalance;
   }

   /**
    * Deposits money into the bank account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount) {
      balance = balance + amount;
      NumFreeTrans++;
   }

   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount) {
      balance = balance - amount;
      NumFreeTrans++;
   }

   /**
    * Gets the current balance of the bank account.
    * @return the current balance
    */
   public double getBalance() {   
      return balance;
   }

   /**
    * Gets the current balance of the bank account Transations.
    * @return the current # of tranactions
    */
   public int getNumFreeTrans() {
      return NumFreeTrans;
   }

   /**
    * Calculated Monthly Charge.
    * @return The balance after applying Monthly Charge
    */
   public double deductMonthlyCharge() {
      if(NumFreeTrans>5){balance = balance - (TransFee * NumFreeTrans);}
      return balance;
   }

   /**
    * Sets the Number of Transactions
    * @return sets the # of transactions
    */
   public void setNumtrans(int numtrans) {
      this.NumFreeTrans = numtrans;
   }

   /**
    * Sets the Transaction fee
    * @return transaction fee
    */
   public void setTransFee(double transFee) {
      TransFee = transFee;
   }

}
