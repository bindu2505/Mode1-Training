package com.hcl.inh;

class First{
	static{
		System.out.println("base class static");
	}
	public First(){
		System.out.println("base class");
	}
}

class Second extends First{
	static{
		System.out.println("derived class static");
	}
	public  Second(){
		System.out.println("derived class");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new Second();
	}

}
