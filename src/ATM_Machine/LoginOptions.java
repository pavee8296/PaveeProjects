package ATM_Machine;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class LoginOptions extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x =1;
		do {
			try {
				data.put(821996, 8296);
				data.put(140596, 1405);
				System.out.println("WELCOME TO THE ATM PROJECT");
				System.out.println("ENTER YOUR ACC NUMBER");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("ENTER YOUR PIN NUMBER");
				setPinnumber(menuInput.nextInt());
		}catch (Exception e) {
			System.out.println("\n" + "Invalid Charater(s). Only Numbers" + "\n");
			x = 2;
		}
		
		int cn = getCustomerNumber();
		int pn = getPinnumber();
		
		if (data.containsKey(cn) && data.get(cn) == pn) {
			getAccountType();
		}else {
			System.out.println("\n" + "wrong customer number" + "\n");
		}
				
	}while (x==1);
	
}
	
	public void getAccountType() {
		
		System.out.println("SELECT THE ACCOUNT TYPE:");
		System.out.println("Type 1: Checking account ");
		System.out.println("Type 2: Saving Account ");
		System.out.println("Type 3: EXIT");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1: 
			getChecking();
			break;
			
		case 2: 
			getSavings();
			break;
		case 3:
			System.out.println("Thanks for Using the ATM.  \n" );
			break;
			
		default: 
			System.out.println("\n"+" Choose From the given Choice" + "\n");
		}
	}
	
	public void getChecking() {
		
		System.out.println("Savings Account: \n");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw Funds");
		System.out.println("Type 3: Deposit Funds");
		System.out.println("Type 4: EXIT");
		System.out.println("\n" + "Choice:");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		
		case 1:
			System.out.println("Checking account balance:" + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println(" Thanks for Using the Atm"+ "\n");
			break;
		default: 
			System.out.println("\n" + "Invalid choice" + "\n");
			getChecking();
			
		}
		
	}
	
	public void getSavings() {
		System.out.println("Savings Account: \n");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw Funds");
		System.out.println("Type 3: Deposit Funds");
		System.out.println("Type 4: EXIT");
		System.out.println("\n" + "Choice:");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		
		case 1:
			System.out.println("Savings account balance:" + moneyFormat.format(getSavingbalance()));
			getAccountType();
			break;
		case 2:
			getSavingsWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingsDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println(" Thanks for Using the Atm"+ "\n");
			break;
		default: 
			System.out.println("\n" + "Invalid choice" + "\n");
			getSavings();
		}
	}
	

}
