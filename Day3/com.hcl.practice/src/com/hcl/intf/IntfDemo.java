package com.hcl.intf;

interface ITraining{
	void name();
	void email();
}

class Hema implements ITraining{

	@Override
	public void name() {
		System.out.println("name is hema");
		
	}

	@Override
	public void email() {
		System.out.println("hema@gmail.com");
	}
	
}

class Keertana implements ITraining{

	@Override
	public void name() {
		System.out.println("name is keertana");
	}

	@Override
	public void email() {
		System.out.println("keertana@gmail.com");
		
	}
	
}

public class IntfDemo {
	
	public static void main(String[] args) {
		ITraining[] arr=new ITraining[]{
				new Hema(),
				new Keertana()
		};
		for (ITraining t : arr) {
			t.name();
			t.email();
		}
	}
}
