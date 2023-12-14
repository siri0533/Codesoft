package codesoft;

import java.util.Scanner;
public class main 
{
	 public static void main(String[] args) 
	 {
	    
	     BankAccount userAccount = new BankAccount(1000);
	     atm  a= new atm(userAccount);
	     Scanner in = new Scanner(System.in);
	     while (true) 
	     {
	         a.displayMenu();
	         System.out.println("Enter option: ");
	         int option = in.nextInt();
	         a.processOption(option,in);
	     }
	 }
}
