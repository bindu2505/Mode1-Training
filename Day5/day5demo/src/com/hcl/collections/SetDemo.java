package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(("vinod"));
		s.add(("hema"));
		s.add(("janani"));
		s.add(("bindu"));
		s.add(("priya"));
		s.add(("vinod"));
		s.add(("hema"));
		s.add(("janani"));
		s.add(("bindu"));
		s.add(("priya"));
		
		s.add(("vinod"));
		s.add(("hema"));
		s.add(("janani"));
		s.add(("bindu"));
		s.add(("priya"));
		System.out.println("hashset data");
		s.forEach(System.out::println);
		
		
		
	}

}
