package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable{

	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("sai");
		lstData.add("bindu");
		lstData.add("priya");
		lstData.add("hema");
		lstData.add("janani");
		lstData.add("keertana");
		
		for (Object object : lstData) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class LinkDemo implements Runnable{
	@Override
	public void run() {
		LinkedList lst = new LinkedList();
		lst.add("bindu");
		lst.add("visalakshi");
		lst.add("anisha");
		lst.add("rishab");
		lst.add("prem");
		lst.addFirst("tarun");
		lst.addLast("kiruba");
		
		
		for (Object object : lst) {
			System.out.println("linked object " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}


class VectorDemo implements Runnable{

	@Override
	public void run() {
		Vector v =new Vector(3,2);
		v.addElement("niveda");
		v.addElement("yashwanth");
		v.addElement("sai kumar");
		v.addElement("prem reddy");
		v.addElement("nagindra");
		v.addElement("jehanat");
		for (Object object : v) {
			System.out.println("vector " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}


public class ThrImp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ListDemo());
		Thread t2 = new Thread(new LinkDemo());
		Thread t3 = new Thread(new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
