package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	static StringBuilder sb = new StringBuilder();
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
		boolean isAdded = true;
		if(objCustomer.getCustId() <= 0){
			sb.append("customer no. cannot be neagative or zero \r\n" );
			isAdded = false;
		}
		if(objCustomer.getCustName().length()<=5){
			sb.append("name should be more than 3 characters \r\n");
			isAdded = false;
		}
		if(objCustomer.getAnnualPremium()<= 20000 && objCustomer.getAnnualPremium() >= 1000000){
			sb.append("annualpremium cannot exceed\r\n");
			isAdded = false;
		}
		if(objCustomer.getModalPremium()<= 1000 && objCustomer.getModalPremium() >= 50000){
			sb.append("modal premium cannot exceed the limit\r\n");
			isAdded = false;
		}
		if(objCustomer.getPaymentMode() <= 0 && objCustomer.getPaymentMode()>= 4  ){
			sb.append("enter the correct payment mode\r\n");
			isAdded = false;
			
		}
		if(isAdded == false){
			throw new CustomerException(sb.toString());
		} else { 
			new CustomerDAO().addCustomerDao(objCustomer);
		}
		return isAdded;
	}
	public Customer searchCustomerBal(int sno){
		return new CustomerDAO().searchCustomerDao(sno);
	}
	public List<Customer> showCustomerBal(){
		return new CustomerDAO().showCustomerDao();
	}
	
	public String updateCustomerBal(Customer objStudent){
		return new CustomerDAO().updateCustomer(objStudent);
	}
	
	public String deleteCustomerBal(int sno){
		return new CustomerDAO().deleteStudentDao(sno);
		
	}
	
	public void writeCustomerFileBal(){
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal(){
		new CustomerDAO().readCustomerFileDao();
	}
}
