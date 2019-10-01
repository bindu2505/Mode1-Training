package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(52));
		lstData.add(new Integer(12));
		lstData.add(new Integer(95));
		lstData.add(new Integer(45));
		lstData.add(new Integer(23));
		lstData.stream().limit(3).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("after skipping two records");
		lstData.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("filter data");
		lstData.stream().filter(p -> p >50).forEach(x ->{
			System.out.println(x);
		});
	}

}
