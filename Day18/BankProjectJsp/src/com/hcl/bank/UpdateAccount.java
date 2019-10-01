package com.hcl.bank;

public class UpdateAccount {
	private int accno;
	private String city;
	private String state;
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String updateAccount(){
		return AccountBAL.updateAccountBal(accno, city, state);
	}

}
