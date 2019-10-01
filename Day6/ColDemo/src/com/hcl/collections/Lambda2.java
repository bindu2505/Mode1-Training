package com.hcl.collections;

@FunctionalInterface
interface IHello{
	void sayHello();
}

@FunctionalInterface
interface ICalc{
	int calc(int a,int b);
}

public class Lambda2 {
  public static void main(String[] args) {
	IHello h1 = () -> {
		System.out.println("hello from rishab...");
	};
	IHello h2= () ->{
	System.out.println("hello from hema...");
  };
  
  IHello h3 = () ->{
	  System.out.println("hello from priya...");
  };
  
  IHello[] arr =new IHello[]{h1,h2,h3};
  for (IHello iHello : arr) {
	iHello.sayHello();
}
  
  
//  h1.sayHello();
//  h2.sayHello();
//  h3.sayHello();
  
  
  ICalc ad1 = (a,b) -> {
	  System.out.println("sum");
	  return a+b;
  };
  ICalc ad2 = (a,b) -> {
	  System.out.println("difference");
	  return a-b;
  };
  System.out.println(ad1.calc(2, 3));
  System.out.println(ad2.calc(8, 1));
  }
}
