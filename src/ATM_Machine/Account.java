package ATM_Machine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customernumber; 
	private int pinnumber;
	private double checkingBalance = 0;
	private double savingbalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");
	
	public int setCustomerNumber (int customernumber) {
		this.customernumber = customernumber;
		return customernumber;		
	}
		
	
	public int getCustomerNumber() {
		return customernumber;
	}
	
	public int getPinnumber() {
		return pinnumber;
	}


	public int setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
		return pinnumber; 
	} 
	
	// Since we are calculating the balance we don't need a setter method 

	public double getCheckingBalance() {
		return checkingBalance;
	}


	public double getSavingbalance() {
		return savingbalance;
	}

	// Logics calculating the balance while withdraw and savings
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingbalance = (savingbalance - amount);
		return savingbalance;
	}
	
	public double calcheckingdeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingdeposit(double amount) {
		savingbalance = (savingbalance + amount);
		return savingbalance;
	}	
	 
	// Get checking method 
	
	public void getCheckingWithdrawInput() {

		System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw");
		double amount = input.nextDouble();
		
		if ((checkingBalance-amount) >=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance is:" + moneyFormat.format(checkingBalance));
						
		}else{
			System.out.println("Innsufficent Balance" + "\n");			
			
		}
		
	}

	public void getSavingsWithdrawInput() {
		
		System.out.println("Savings Account Balance:" + moneyFormat.format(savingbalance));
		System.out.println("Amount you want to withdraw");
		double amount = input.nextDouble();
		
		if ((savingbalance-amount) >=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving account balance is:" + moneyFormat.format(savingbalance));
						
		}else{
			System.out.println("Innsufficent Balance" + "\n");			
			
		}
		
		}
	
	public void getCheckingDepositInput() {
		
		System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >=0) {
			calcheckingdeposit(amount);
			System.out.println("New checking account balance is:" + moneyFormat.format(checkingBalance));
						
		}else{
			System.out.println("Innsufficent Balance" + "\n");			
			
		}
				
	}

public void getSavingsDepositInput() {
	
	System.out.println("Savings Account Balance:" + moneyFormat.format(savingbalance));
	System.out.println("Amount you want to Deposit");
	double amount = input.nextDouble();
	
	if ((savingbalance + amount) >=0) {
		calcSavingdeposit(amount);
		System.out.println("New Saving account balance is:" + moneyFormat.format(savingbalance));
					
	}else{
		System.out.println("Innsufficent Balance" + "\n");			
		
	}
}
	
	
	}
