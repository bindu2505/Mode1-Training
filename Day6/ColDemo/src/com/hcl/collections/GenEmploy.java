package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy = new ArrayList<Employ>();
		lstEmploy.add(new Employ(1, "bindu",2456 ));
		lstEmploy.add(new Employ(2, "hema",254653 ));
		lstEmploy.add(new Employ(3, "priya",8545 ));
		lstEmploy.add(new Employ(4, "janani", 5456));
		lstEmploy.add(new Employ(5, "anisha", 57961));
		lstEmploy.add(new Employ(6, "jehanat", 8746));
		System.out.println("employ list");
		lstEmploy.forEach(System.out::println);
	}

}
