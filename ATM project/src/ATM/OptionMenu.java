package ATM;

import java.io.*;

import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;


public class OptionMenu extends Account{
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'&'###,##0.00");
	HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();

	public void getLogin() throws IOException {
		int x = 1;
		while(x == 1) {
			try {
				data.put(987654 , 9876);
				data.put(998877 , 9988);
				
				System.out.println(". . . Welcome to ATM . . .");
				System.out.println("Enter your Account number : ");
				setCustomerNumber(sc.nextInt());
				System.out.println("Enter password : ");
				setCustomerPassword(sc.nextInt());
			} catch(Exception e) {
				System.out.printf("\n" + " Invalid Character(s) Only Numbers " + "\n");
				x = 2;
			}
			for(Entry<Integer , Integer> entry : data.entrySet())
			{
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getCustomerPassword()) {
					getAccountType();
				} else {
					System.out.println(". . . Invalid Account number and Password . . .");
				}
			}
			
		} 
	}
	
	public void getAccountType() {
		int i;
		System.out.printf(" 1. Current Account \n 2. Savings Account \n 3. Exit \n");
		System.out.println("\n Select Account type : ");
		i = sc.nextInt();
		switch(i){
			case 1 :
				getCurrentAccount();
				break;
				
			case 2 :
				getSavingsAccount();
				break;
			
			case 3 :
				System.out.println(". . . Thanks for using ATM . . .");
				break;
				
			default :
				System.out.println(". . . Invalid choice . . .");
				getAccountType();
		}
	}
	
	public void getCurrentAccount() {
		int i;
		System.out.printf(" 1. Balence \n 2. Withdrawl \n 3. Deposit \n 4. Exit \n");
		System.out.println("\n Choose an option : ");
		i = sc.nextInt();
		switch(i) {
			case 1 : 
				System.out.println("Balence in your account is : " + money.format(getCurrentBalence()));
				getCurrentAccount();
				break;
				
			case 2 :
				getCurrentWithdrawlInput();
				getCurrentAccount();
				break;
				
			case 3 :
				getCurrentDepositInput();
				getCurrentAccount();
				break;
				
			case 4 :
				System.out.println(". . . Thanks for using ATM . . .");
				break;
				
			default :
				System.out.println(". . . Invalid option . . .");
				getCurrentAccount();
		}
	}
	public void getSavingsAccount() {
		int i;
		System.out.printf(" 1. Balence \n 2. Withdrawl \n 3. Deposit \n 4. Exit \n");
		System.out.println("\n Choose an option : ");
		i = sc.nextInt();
		switch(i) {
			case 1 : 
				System.out.println("Balence in your account is : " + money.format(getSavingsBalence()));
				getSavingsAccount();
				break;
				
			case 2 :
				getSavingsWithdrawlInput();
				getSavingsAccount();
				break;
				
			case 3 :
				getSavingsDepositInput();
				getSavingsAccount();
				break;
				
			case 4 :
				System.out.println(". . . Thanks for using ATM . . .");
				break;
				
			default :
				System.out.println(". . . Invalid option . . .");
				getSavingsAccount();
		}
	}

}
