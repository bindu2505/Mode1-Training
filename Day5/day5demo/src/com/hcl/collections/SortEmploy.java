package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		//Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1,"hema",545));
		s.add(new Employ(2,"bindu",245));
		s.add(new Employ(3,"janani",4457));
		s.add(new Employ(4,"jehanat",4522));
		s.add(new Employ(5,"priya",5454));
		System.out.println("sorted data");
		s.forEach(System.out::println);
	}

}
