package ATM;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Account {
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'&'###,##0.00");
	HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setCustomerPassword(int customerPassword) {
		this.customerPassword = customerPassword;
		return customerPassword;
	}
	
	public int getCustomerPassword() {
		return customerPassword;
	}
	
	public double getCurrentBalence() {
		return currentBalence;
	}
	
	public double getSavingsBalence() {
		return savingsBalence;
	}
	
	public double calcCurrentWithdrawl(double amount) {
		currentBalence = (currentBalence - amount);
		return currentBalence;
	}
	
	public double calcSavingsWithdrawl(double amount) {
		savingsBalence = (savingsBalence - amount);
		return savingsBalence;
	}
	
	public double calcCurrentDeposit(double amount) {
		currentBalence = (currentBalence + amount);
		return currentBalence;
	}
	
	public double calcSavingsDeposit(double amount) {
		savingsBalence = (savingsBalence + amount);
		return savingsBalence;
	}
	
	public void getCurrentWithdrawlInput() {
		System.out.println("Current account balence is : " + money.format(currentBalence));
		System.out.println("Type amount you want to withdrawl : ");
		double amount = sc.nextDouble();
		if(currentBalence - amount >= 0) {
			calcCurrentWithdrawl(amount);
			System.out.println("Current acccount balence is : " + money.format(currentBalence));
		} else {
			System.out.println(". . . Insufficient Fund . . .");
		}
	}
	
	public void getCurrentDepositInput() {
		System.out.println("Current account balence is : " + money.format(currentBalence));
		System.out.println("Type amount you want to deposit : ");
		double amount = sc.nextDouble();
		if(currentBalence + amount >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("Current acccount balence is : " + money.format(currentBalence));
		} else {
			System.out.println(". . . Insufficient Fund . . .");
		}
	}
	
	public void getSavingsWithdrawlInput() {
		System.out.println("Savings account balence is : " + money.format(savingsBalence));
		System.out.println("Type amount you want to withdrawl : ");
		double amount = sc.nextDouble();
		if(savingsBalence - amount >= 0) {
			calcSavingsWithdrawl(amount);
			System.out.println("Savings acccount balence is : " + money.format(savingsBalence));
		} else {
			System.out.println(". . . Insufficient Fund . . .");
		}
	}
	
	public void getSavingsDepositInput() {
		System.out.println("Savings account balence is : " + money.format(savingsBalence));
		System.out.println("Type amount you want to deposit : ");
		double amount = sc.nextDouble();
		if(savingsBalence + amount >= 0) {
			calcSavingsDeposit(amount);
			System.out.println("Savings acccount balence is : " + money.format(savingsBalence));
		} else {
			System.out.println(". . . Insufficient Fund . . .");
		}
	}

	
	
	private int customerNumber;
	private int customerPassword;
	private double currentBalence = 0;
	private double savingsBalence = 0;
}
