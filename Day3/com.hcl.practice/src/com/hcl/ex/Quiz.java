package com.hcl.ex;

public class Quiz {
	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,4,5};
			a[6]=5/0;  //right to left precedence
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array");
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
