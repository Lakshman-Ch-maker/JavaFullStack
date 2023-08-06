package com.bov.abstractclass;

public class Test {
	public static void main(String[] args) {
			// Bank b = new Bank();
			
			IciciBank bank = new IciciBank();
			bank.deposit();
			bank.withdraw();
			bank.loan();
			bank.interest();
			
	}
}
