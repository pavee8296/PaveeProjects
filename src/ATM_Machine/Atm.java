package ATM_Machine;

import java.io.IOException;

public class Atm extends LoginOptions {
	
	public static void main(String[] args)   {
		
		LoginOptions login = new LoginOptions();
		try {
			login.getLogin();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
