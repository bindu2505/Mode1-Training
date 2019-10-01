package com.hcl.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sortstudent {
	public static void main(String[] args) {
		Comparator<Student> c = new CityComparator();
		Set<Student> setStudent = new TreeSet<Student>(c);
		setStudent.add(new Student("bindu", "shree", "hassan",9.5 ));
		setStudent.add(new Student("priya", "darshini", "trichy",10 ));
		setStudent.add(new Student("hema", "j", "chennai",10 ));
		setStudent.add(new Student("janani", "v", "chennai",10 ));
		setStudent.add(new Student("jehanat", "jamil", "delhi", 8.5));
		System.out.println("student list");
		setStudent.forEach(System.out::println);
	}

}
