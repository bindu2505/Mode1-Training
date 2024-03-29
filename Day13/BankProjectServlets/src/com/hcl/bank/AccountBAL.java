package com.hcl.bank;

public class AccountBAL {
	
	public static String withdrawAccountBal(int accountno,int withDrawAmount){ 
		return new AccountDAO().withdrawAccountDao(accountno, withDrawAmount);
	}
	
	public static String depositAccountBal(int accountno,int depAmount){
		return new AccountDAO().depositAccountDao(accountno, depAmount);
				
	}
	
	public static String closeAccountBal(int accountNo){
		return new AccountDAO().closeAccountDao(accountNo);
	}
	
	
	public static String updateAccountBal(int accountNo , String city , String state){
		return new AccountDAO().updateAccountDao(accountNo, city, state);           
	}
	

	public static Accounts searchAccountBal(int accountNo){
		return new AccountDAO().searchAccountDao(accountNo);
	}
	
	public static String createAccountBal(Accounts objAccounts){
		return new AccountDAO().createAccountDao(objAccounts);
		
	}
	
	public static int generateAccountBal(){
		return new AccountDAO().generateAccountNoDao();
	}

}
