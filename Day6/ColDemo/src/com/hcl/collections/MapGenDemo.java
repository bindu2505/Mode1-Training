package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer,String>();
		m.put(1, "bindu");
		m.put(2, "neethu");
		m.put(3, "vishnu");
		m.put(4, "hema");
		
		
		int key;
		String result;
		System.out.println("enter key  ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "default value");
		System.out.println(result);
		
		}

}
