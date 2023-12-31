package codesoft;

	import java.util.Scanner;
	class atm 
	{
	 private BankAccount bankAccount;
	 public atm(BankAccount bankAccount)
	 {
	     this.bankAccount = bankAccount;
	 }

	 public void displayMenu() 
	 {
	     System.out.println("1. Withdraw");
	     System.out.println("2. Deposit");
	     System.out.println("3. Check Balance");
	     System.out.println("4. Exit");
	 }
	double amount;
	 public void processOption(int option, Scanner in) {
	     switch (option) {
	         case 1:
	             withdraw(amount);
	             break;

	         case 2:
	            deposit(amount);
	             break;

	         case 3:
	             checkBalance();
	             break;

	         case 4:
	             System.out.println("Exiting. Thank you!");
	             System.exit(0);
	             break;

	         default:
	             System.out.println("Invalid option. Please select a valid option.");
	     }
	 }
	 public void withdraw(double withdrawAmount)
	 {
	 Scanner in=new Scanner(System.in);
	 System.out.print("Enter withdrawal amount: ");
	  withdrawAmount = in.nextDouble();
	 if (withdrawAmount > 0) {
	     bankAccount.withdraw(withdrawAmount);
	     System.out.println("Withdrawal successful. Current balance: Rs " + bankAccount.getBalance());
	 } else {
	     System.out.println("Invalid amount. Withdrawal canceled.");
	 }
	 }
	 public void deposit(double depositAmount)
	 {
		Scanner in=new Scanner(System.in);
	    System.out.print("Enter deposit amount: ");
	    depositAmount = in.nextDouble();
	    if (depositAmount > 0) 
	    {
	    	bankAccount.deposit(depositAmount);
	    	System.out.println("Deposit successful. Current balance: Rs " + bankAccount.getBalance());
	    } 
	    else 
	    {
	    	System.out.println("Invalid amount. Deposit canceled.");
	    }
	 }
	 public void checkBalance()
	 {
		 System.out.println("Current balance: Rs " + bankAccount.getBalance());
	 }
	 

	}


