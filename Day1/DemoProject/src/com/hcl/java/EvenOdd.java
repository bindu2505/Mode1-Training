package com.hcl.java;

public class EvenOdd {
	
	public void check(int n){
		if(n%2==0){
			System.out.println("even number...");
		}else {
			System.out.println("odd number....");
		}
	}
	
	public static void main(String[] args) {
		int n=2;
	    new EvenOdd().check(n);
	}

}
