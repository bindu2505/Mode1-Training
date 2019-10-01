package com.hcl.inh;

public class StringFunction {
	
	static String name;
	public StringFunction(String name){
		this.name=name;
	}
	
	public void charpos(int i){
		char[] a= name.toCharArray();
		System.out.println("position of char is "+ a[i]);
		
	}
	
	public int length1(){
		char[] arr=name.toCharArray();
		int i=0;
		for(char c: arr){
			i++;
			
		}
		return i;
		
		
	}
	
	public void toupper(){
		                
		
			
		}
	
	
	public static void main(String[] args) {
		StringFunction obj = new StringFunction("bindu");
		System.out.println("length is "+ obj.length1());
		obj.charpos(3);
	}
}
