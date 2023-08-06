package com.bov.interfaces;

public class Test {
	public static void main(String[] args) {
			// Bank bank = Bank();
		
		IciciBank icicibank = new IciciBank();
		icicibank.deposit();
		icicibank.withdraw();
		icicibank.loan();
		icicibank.interest();
	
	}
}
