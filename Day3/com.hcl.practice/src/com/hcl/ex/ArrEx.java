package com.hcl.ex;

public class ArrEx {
	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,5};
			a[10]=24;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array entered is out of bound");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
