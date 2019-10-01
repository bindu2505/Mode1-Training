package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<Integer> lstData = new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(58));
		lstData.add(new Integer(14));
		lstData.add(new Integer(3));
		lstData.add(new Integer(95));
		lstData.forEach(p -> {
			if(p>=15){
				System.out.println(p);
			}
		});
		
	}

}
