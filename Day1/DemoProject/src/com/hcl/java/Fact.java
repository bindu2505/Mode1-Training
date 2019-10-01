package com.hcl.java;

public class Fact {
	
	public void calc(int n){
		int i=1,f=1;
		while(i<=n){
			f=f*i;
			i++;
			
		}
		System.out.println("fact=" + f);
	}
	
	public static void main(String[] args) {
		int n=4;
		new Fact().calc(n);
	}
}
