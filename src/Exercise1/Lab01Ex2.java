package Exercise1;

class Lab01EX2 {
	
	public static void main(String[] args) {
		
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		
		// Step 1
		account1.initialize("Jane");
		account1.withdraw(40);
		//Account 2
		account2.initialize("Fred");
		account2.deposit(200);
		
		//Account 3
		account3.initialize("George");
		account3.deposit(50);
		
		System.out.println("/////////Account 1/////////////");
		//account 1
		System.out.println("Account1: Starting Amount");
		account1.print();
		System.out.println();
		//account 1
		account1.deposit(100);
		System.out.println("Account1: Deposit of $100");
		account1.print();
		System.out.println();
		// account 1
		account1.withdraw(40);
		System.out.println("Account1: Withdraw of $40 again ");
		account1.print();
		System.out.println();
		
		System.out.println("////////////Account 2/////////////");
		/////////////////////////
		
		//Account 2 - original
		System.out.println("Account2: Starting Amount");
		account2.print();
		System.out.println();
		
		//Account 2 - After withdrawel of $125
		account2.withdraw(125);
		System.out.println("Account2: Withdraw of $125");
		account2.print();
		System.out.println();
		
		System.out.println("///////////Account 3//////////////");
		/////////////////////////
		
		//Account 3 - original
		System.out.println("Account3: Starting Amount");
		account3.print();
		System.out.println();
		
		System.out.println("///////////Account 1 Last Review//////////////");
		/////////////////////////
		
		//Account 2
		account2.deposit(60);
		
		//Account 1
		account1.withdraw(20);
		
		//Showing Respective results
		//-----------------------------//
		//account 1
		System.out.println("Account1: Last Known Account Amount");
		account1.print();
		System.out.println();
		System.out.println("///////////Account 2 Last Review//////////////");
		//account 2
		System.out.println("Account2: Last Known Account Amount");
		account2.print();
		System.out.println();
		System.out.println("//////////Account 3 Last Review///////////////");
		//account 3
		System.out.println("Account3: Last Known Account Amount");
		account3.print();
		System.out.println();
		System.out.println("/////////END/////////////");
	}
}