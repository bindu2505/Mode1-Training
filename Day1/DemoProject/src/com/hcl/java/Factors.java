package com.hcl.java;

public class Factors {
	public void show(int n){
		for (int i=1; i<=n; i++){
			if(n%i==0){
				System.out.println("factor "+ i);
			}
				}
			
	}
	public static void main(String[] args) {
		int n=15;
		new Factors().show(n);
	}

}
