package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("AxisBankdeposit");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank axis= new AxisBank();
		axis.deposit();
		
		System.out.println("AxisBank Deposit");
		
		
		BankInfo bankdeposit = new BankInfo();
		bankdeposit.deposit();
		System.out.println("BankInfo Deposit");
	}
}
