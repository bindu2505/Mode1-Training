package com.hcl.ex;

class Cl1{
	int a,b;
	public Cl1(){
		a=5;b=8;
	}
	@Override
	public String toString() {
		return "Cl1 [a=" + a + ", b=" + b + "]";
	}
	
}

class Cl2 extends Cl1{
	public Cl2(int a,int b){
		
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Cl2 obj=new Cl2(12,12);
		System.out.println(obj);
	}

}
