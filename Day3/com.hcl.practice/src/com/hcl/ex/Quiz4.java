package com.hcl.ex;

public class Quiz4 {
	public static void main(String[] args) {
		Object[] arr=new Object[]{
				12,"welcome",12.4,true,3422,"blore","bindu"
		};
		for (Object object : arr) {
			if(object instanceof Integer){
				System.out.println(object);
				
			}
			
			if(object instanceof String){
				System.out.println(object);
			}
		}
	}

}
