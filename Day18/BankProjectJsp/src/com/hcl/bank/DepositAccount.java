package com.hcl.bank;

public class DepositAccount {
	private int accno;
	private int depamount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getDepamount() {
		return depamount;
	}
	public void setDepamount(int depamount) {
		this.depamount = depamount;
	}
	public String depositAccount(){
		return AccountBAL.depositAccountBal(accno, depamount);
	}

}
