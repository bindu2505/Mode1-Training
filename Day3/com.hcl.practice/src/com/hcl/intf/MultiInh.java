package com.hcl.intf;

interface IOne{
	void name();
}

interface ITwo{
	void email();
}

class Test implements IOne,ITwo{

	@Override
	public void email() {
			System.out.println("emailhcl@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("company hcl");
	}

	
	
}

public class MultiInh {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}
