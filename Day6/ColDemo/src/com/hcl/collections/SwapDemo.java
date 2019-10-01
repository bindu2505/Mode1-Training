package com.hcl.collections;

class Data<T>{
	public void swap(T x , T y){
		T t;
		t = x;
		x = y;
		y = t;
		System.out.println("x value " + x + " y value " + y);
		
	}
}

public class SwapDemo {
	public static void main(String[] args) {
		Data obj = new Data();
		int x = 12;
		int y = 13;
		obj.swap(x, y);
		double b1 = 12.5;
		double b2 = 15.9;
		obj.swap(b1, b2);
		String s1 = "hello";
		String s2 = "world";
		obj.swap(s1, s2);
		boolean f1 = true;
		boolean f2 = false;
		obj.swap(f1, f2);
		
	}

}
