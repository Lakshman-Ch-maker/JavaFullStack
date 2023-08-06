package com.bov.assignmentpart3;

/* Bank Account Inheritance: Create a class hierarchy representing different types of bank accounts, 
such as "SavingsAccount" and "CurrentAccount." Implement common functionalities like deposit and withdrawal in the base class 
and specific functionalities like interest calculation in the derived classes. 
*/

import java.util.Scanner;
import java.lang.System;

 class BankAccount
 {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 float withdrawal(float cashWithdraw, float initialAmount, int pin)
	 {
		 float finalAmount = 0;
		 int count = 0;
		 int transaCompl = 0;
		 
		 if(cashWithdraw <= initialAmount)
		 {
			 while(count < 3 && transaCompl == 0)
			 {
			 System.out.println("Enter pin for transaction to proceed : ");
			 int userPin = sc.nextInt();
			 if(userPin == pin)
			 {
				 System.out.println("Transaction Processing...");
				 finalAmount = initialAmount - cashWithdraw;
				 System.out.println("The balance in your account is : "+finalAmount);
				 transaCompl = 1;
			 }
			 else
			 {
				 System.out.println("wrong PIN");
				 count = count + 1;
			 }
			 }
			 
		 }
		 
		 else
		 {
			 System.out.println("Transaction declined due to Insufficient funds, sorry for the inconvenience...");
			 finalAmount = initialAmount;
		 }
		 
		 return finalAmount;
	 }
	 
	 float deposit(float cashDeposit, float initialAmount)
	 {
		 float finalAmount;
		 
		 finalAmount = initialAmount + cashDeposit;
		 System.out.println("Amount "+cashDeposit+" deposited into your bank account");
		 System.out.println("Final Amount is"+finalAmount);
		 return finalAmount;
	 }
	 
	 void showBalance(float accountBalance)
	 {
		 System.out.println("The account Balance is : "+accountBalance);
	 }
	 
	 int setPin()
	 {
		 int pin;
		 System.out.println("Please enter pin that you want to set : ");
		 pin = sc.nextInt();
		 System.out.println("PIN set successfully...");
		 return pin;
	 }
	 
 }
 
 class SavingsAccount extends BankAccount
 {
	 private String accountHolderName = "K. VIJAY";
	 private String accountNumber = "09347838746";
	 private static int pin = 123456;
	 private static float initialAmount = 50000;
	 
	 void calculateInterest(int time)
	 {
		 float interest = (initialAmount*time*2)/100;
		System.out.println("The interest for your requested time frame "+time+" years is : "+interest+" and the total amount will be : "+(initialAmount+interest));
	 }
	 
	 String getAccountHolderName()
	 {
		 return accountHolderName;
	 }
	 
	String getAccountNumber()
	 {
		 return accountNumber;
	 }
	 
	 
	 void setPIN()
	 {
		 pin = setPin();
	 }
	 
	 void showBalance()
	 {
		 super.showBalance(initialAmount);
	 }
	 
	 void deposit(float depositAmount)
	 {
		 initialAmount = super.deposit(depositAmount, initialAmount);
	 }
	 
	 void withdrawal(float cashWithdraw)
	 {
		 
		 initialAmount = super.withdrawal(cashWithdraw, initialAmount, pin);
	 }
 }
 
 class CurrentAccount extends BankAccount
 {
	 private String accountHolderName = "G. VINAY";
	 private String accountNumber = "09234567891";
	 private static int pin = 234567;
	 private static float initialAmount = 100000;
	 
	 void calculateInterest(int time)
	 {
		 float interest = (initialAmount*time*5)/100;
		System.out.println("The interest for your requested time frame "+time+" years is : "+interest+" and the total amount will be : "+(initialAmount+interest));
	 }
	 
	 String getAccountHolderName()
	 {
		 return accountHolderName;
	 }
	 
	 String getAccountNumber()
	 {
		 return accountNumber;
	 }
	 
	 float getInitialAmount()
	 {
		 return initialAmount;
	 }
	 
	 void setPIN()
	 {
		 pin = setPin();
	 }
	 
	 void showBalance()
	 {
		 super.showBalance(initialAmount);
	 }
	 
	 void deposit(float depositAmount)
	 {
		 initialAmount = super.deposit(depositAmount, initialAmount);
	 }
	 
	 void withdrawal(float cashWithdraw)
	 {
		 initialAmount = super.withdrawal(cashWithdraw, initialAmount, pin);
	 }
 }
 
 class BankAccountTest
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 int choiceAccount;
		  int choice;
		 System.out.println("Enter an option \n 1. Savings Account \n 2. Current Account : ");
		 choiceAccount = sc.nextInt();
		 
		 switch(choiceAccount)
		 {
			 case 1:
			 SavingsAccount sa = new SavingsAccount();
		 System.out.println("Your Savings account details are as follows : ");
		 System.out.println("Account Holder Name : "+sa.getAccountHolderName());
		 System.out.println("Account Number :"+sa.getAccountNumber());
		 System.out.println("Choose from below options : \n 1. Show Balance \n 2. Deposit \n 3. Withdrawal \n 4. exit() \n Enter : ");
		
		 choice = sc.nextInt();
		 
			 switch(choice)
		 {
			 case 1:
			 sa.showBalance();
			 break;
			 
			 case 2:
			 System.out.println("Enter the amount you want to deposit : ");
			 float depositAmount = sc.nextFloat();
			 sa.deposit(depositAmount);
			 break;
			 
			 case 3:
			 System.out.println("Enter the amount you want to withdraw : ");
			 float withdrawalAmount = sc.nextFloat();
			 sa.withdrawal(withdrawalAmount);
			 break;
			 
			 case 4:
			 exit();
			 break;
			 
			 default:
			 System.out.println("Incorrect answer...");
		 }
		 
		 
		 break;
		 
			case 2:
			CurrentAccount ca = new CurrentAccount();
		 System.out.println("Your Current account details are as follows : ");
		 System.out.println("Account Holder Name : "+ca.getAccountHolderName());
		 System.out.println("Account Number :"+ca.getAccountNumber());
		 System.out.println("Choose from below options : \n 1. Show Balance \n 2. Deposit \n 3. Withdrawal \n 4. exit() \n Enter : ");
		 choice = sc.nextInt();
		 
		
		
			 switch(choice)
		 {
			 case 1:
			 ca.showBalance();
			 break;
			 
			 case 2:
			 System.out.println("Enter the amount you want to deposit : ");
			 float depositAmount = sc.nextFloat();
			 ca.deposit(depositAmount);
			 break;
			 
			 case 3:
				 System.out.println("Enter the amount you want to withdraw : ");
				 float withdrawalAmount = sc.nextFloat();
				 ca.withdrawal(withdrawalAmount);
			 break;
			 
			 case 4:
			 exit();
			 break; 
			 
			 default:
			 System.out.println("Incorrect answer, please try again...");
		 }
		 
		 break;
		 
		 default:
		 System.out.println("Incorrect Answer");
		 
		 }
		
	 }

	private static int exit() {
		// TODO Auto-generated method stub
		System.out.println("You are exited...");
		return 0;
		
	}
 }