package com.hcl.ex;

class C1{
	static void test(){
		System.out.println("welcome");
	}
}

class C2 extends C1{
	static void test(){
		System.out.println("bye");
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.test();
	}
}
