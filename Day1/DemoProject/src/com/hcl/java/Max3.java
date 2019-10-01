package com.hcl.java;

public class Max3 {
	
	public void check(int n1,int n2,int n3){
		if((n1>n2)&& (n1>n3)){
			System.out.println("n1 is largest");
		}else if(n2>n3){
			System.out.println("n2 is largst");
		}else{
			System.out.println("n3 is largest");
		}
	}
	public static void main(String[] args) {
		int n1=10,n2=15,n3=1;
		Max3 obj= new Max3();
		obj.check(n1, n2, n3);
	}
}
