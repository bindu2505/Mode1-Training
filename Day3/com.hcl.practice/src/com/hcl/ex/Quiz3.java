package com.hcl.ex;
class Employ{
	
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
	
}

class HrEmploy extends Employ{
	
	public HrEmploy(String name){
		super(name);
	}
}

class JavaEmploy extends Employ{
	public JavaEmploy(String name ){
		super(name);
	}
}

public class Quiz3 {

	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]{
				new HrEmploy("sagar"),
				new HrEmploy("arun"),
				new HrEmploy("ram"),
				new HrEmploy("anusha"),
				new HrEmploy("bindu"),
				new JavaEmploy("neethu"),
				new JavaEmploy("vishnu"),
				new JavaEmploy("narendra"),
				new JavaEmploy("lakshmi"),
				new JavaEmploy("sundarraj")
		};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
			
		}
	}
}
