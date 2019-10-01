package com.hcl.bank;

public class CloseAccount {
	private int accno;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public String closeAccount(){
		return AccountBAL.closeAccountBal(accno);
	}
}
