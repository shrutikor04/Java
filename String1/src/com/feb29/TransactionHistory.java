package com.feb29;
class Atm {
	void Banktransaction(int deposite) {
		System.out.println("Deposite Rupee:"+deposite);
	}
	void Banktransaction(long withdraw) {
		System.out.println("Withdraw"+withdraw);
	}
}


public class TransactionHistory {

		public static void main(String[] args) {
			Atm a1=new Atm();
			a1.Banktransaction(2000);
			a1.Banktransaction(100000L);
		}

	}



