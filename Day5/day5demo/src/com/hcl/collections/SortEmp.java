package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(new Emp(1,"hema",545));
		s.add(new Emp(2,"bindu",245));
		s.add(new Emp(3,"janani",4457));
		s.add(new Emp(4,"jehanat",4522));
		s.add(new Emp(5,"priya",5454));
		System.out.println("sorted data");
		s.forEach(System.out::println);
	}

}
