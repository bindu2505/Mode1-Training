package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
  public static void main(String[] args) {
    List lstNames = new ArrayList();
    lstNames.add("bindu");
		lstNames.add("neethu");
		lstNames.add("vishnu");
		lstNames.add("lakshmi");
		lstNames.add("narendra");
		System.out.println("Names are ");
		
//		for (Object object : lstNames) {
//			System.out.println(object);
//			
//		}
		System.out.println("JDK 1.8");
		lstNames.forEach(System.out::println);
		
		/*edit*/
		lstNames.set(2, "sri vishnu");
		System.out.println("list after update");
		lstNames.forEach(System.out::println);
		
		/*remove*/
		System.out.println("list after removing by index");
		lstNames.remove(0);
		lstNames.forEach(System.out::println);
		
		System.out.println("list after removing by object");
		lstNames.remove("neethu");
		lstNames.forEach(System.out::println);
		
		System.out.println("get element");
		System.out.println(lstNames.get(1));
	}

}
