package codesoft;


	class BankAccount 
	{
		private double balance;
		public BankAccount(double initialBalance) 
		{
		   this.balance = initialBalance;
		}
		public double getBalance()
		{
		     return balance;
		}
		public void deposit(double amt) 
		{
		     balance += amt;
		}
		public boolean withdraw(double amt) 
		{
		     if (amt <= balance) 
		     {
		         balance -= amt;
		         return true;
		     }
		     else 
		     {
		         System.out.println("Insufficient funds. Withdrawal canceled.");
		         return false;
		     }
		 }
	}


