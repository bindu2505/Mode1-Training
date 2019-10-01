package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		Stock stock=new Stock();
		Scanner sc = new Scanner(System.in);
		String stockid=StockBAL.generateStockIdBal();
		String itemname;
		double price;
		int quantityAvail;
		stock.setStockid(stockid); 
		System.out.println("enter item name");
		stock.setItemName(sc.nextLine());
		System.out.println("enter price");
		stock.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("enter the quantity for the item...");
		stock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		System.out.println(StockBAL.createStockItemNameBal(stock ));
		
	} 

}
