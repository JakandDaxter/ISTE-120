import java.util.Scanner;

public class BankAccountTester {
    BankAccount bank;

    public static void main(String[] args) {
        BankAccountTester test = new BankAccountTester();
        test.scneerio1();
        test.scneerio2();
        test.scneerio3();
        test.scneerio4();


    }

    public void scneerio1(){
         bank = new BankAccount(1000);
         bank.setTransFee(2.00);
        System.out.println("Set up new account with $1000, 5 free transactions and $2 per transaction above 5");
        System.out.println("Starting Balance: "+ bank.getBalance());
        bank.deposit(1000);bank.withdraw(500);bank.withdraw(400);bank.deposit(200);
        System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 - "+ bank.getNumFreeTrans() + " transactions");
        System.out.println("Balance: "+ bank.getBalance());
        System.out.println("Expected: "+ bank.getBalance());
        System.out.println("Apple Monthly Charge");
        System.out.println("Ending Balance Month 1: "+ bank.deductMonthlyCharge());
        System.out.println("Expected: "+ bank.getBalance());
        bank.setNumtrans(0);
    }

    public void scneerio2(){
        System.out.println("\n\nStarting Balance: "+ bank.getBalance());
        bank.deposit(1000);bank.withdraw(500);bank.withdraw(400);bank.deposit(200);bank.deposit(500);
        System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - "+ bank.getNumFreeTrans() + " transactions");
        System.out.println("Balance: "+ bank.getBalance());
        System.out.println("Expected: "+ bank.getBalance());
        System.out.println("Apple Monthly Charge");
        System.out.println("Ending Balance Month 2: "+ bank.deductMonthlyCharge());
        System.out.println("Expected: "+ bank.getBalance());
        bank.setNumtrans(0);
    }

    public void scneerio3(){
        System.out.println("\n\nStarting Balance: "+ bank.getBalance());
        bank.deposit(1000);bank.withdraw(500);bank.withdraw(400);bank.deposit(200);bank.deposit(500);bank.withdraw(1000);
        System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000 - "+ bank.getNumFreeTrans() + " transactions");
        System.out.println("Balance: "+ bank.getBalance());
        System.out.println("Expected: "+ bank.getBalance());
        System.out.println("Apple Monthly Charge");
        System.out.println("Ending Balance Month 3: "+ bank.deductMonthlyCharge());
        System.out.println("Expected: "+ bank.getBalance());
        bank.setNumtrans(0);
    }

    public void scneerio4(){
        System.out.println("\n\nStarting Balance: "+ bank.getBalance());
        bank.deposit(1000);bank.withdraw(500);bank.withdraw(400);bank.deposit(200);bank.deposit(500);bank.withdraw(1000);bank.deposit(100);
        System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000, deposit 100 - "+ bank.getNumFreeTrans() + " transactions");
        System.out.println("Balance: "+ bank.getBalance());
        System.out.println("Expected: "+ bank.getBalance());
        System.out.println("Apple Monthly Charge");
        System.out.println("Ending Balance Month 4: "+ bank.deductMonthlyCharge());
        System.out.println("Expected: "+ bank.getBalance());
        bank.setNumtrans(0);
    }

}
