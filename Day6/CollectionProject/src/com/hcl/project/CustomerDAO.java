package com.hcl.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer> lstCustomer = null;
	static{
		lstCustomer = new ArrayList<Customer>();
	}
	 public String addCustomerDao(Customer customer){
		 lstCustomer.add(customer);
		 return "data updated successfully...";
	 }
	 
	 public List<Customer> showCustomerDao(){
		 return lstCustomer;
	 }
	 public Customer searchCustomerDao(int custId){
		 Customer objCustomer=null;
		 for (Customer customer : lstCustomer) {
			 if(customer.getCustId()== custId){
				 objCustomer=customer;
			 }
		}
		 return objCustomer;
	 }
	 
	 public String deleteStudentDao(int custId){
		 Customer customer=searchCustomerDao(custId);
		 if(customer != null){
			 lstCustomer.remove(customer);
			 return "data removed successfully..";
		 } else {
		 return "customer not found..";
	     }
    }
	 public String updateCustomer(Customer objCustomer){
		 Customer customer= searchCustomerDao(objCustomer.getCustId());
		 if(customer != null){
			 for (Customer c : lstCustomer) {
				 if(c.getCustId()== objCustomer.getCustId()){
					 c.setCustName(objCustomer.getCustName());
					 c.setAnnualPremium(objCustomer.getAnnualPremium());
					 c.setModalPremium(objCustomer.getAnnualPremium());
					 c.setPaymentMode(objCustomer.getPaymentMode());
				 }
			 }
			return "data updated successfully...";
				 } else { 
					 return "data not updated..... ";
				 }
	 }
	 public void writeCustomerFileDao() {
			try {
				FileOutputStream fout=new FileOutputStream("C:/files/customer2.txt");
				ObjectOutputStream objout=new ObjectOutputStream(fout);
				objout.writeObject(lstCustomer);
				objout.close();
				fout.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void readCustomerFileDao() {
			try {
				FileInputStream fin=new FileInputStream("C:/files/customer2.txt");
				ObjectInputStream objin=new ObjectInputStream(fin);
				lstCustomer =(List<Customer>)objin.readObject();
				objin.close();
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
				
			
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 

