package com.hcl.java;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] a =new int[]{12,54,78,5};
		
		System.out.println("elements of array are ");
		
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
			
		}
	}

}
