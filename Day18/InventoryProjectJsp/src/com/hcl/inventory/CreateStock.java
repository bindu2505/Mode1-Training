package com.hcl.inventory;


public class CreateStock {
	private String stockid;
	private String itemname;
	private double price;
	private int quantityavail;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantityavail() {
		return quantityavail;
	}
	public void setQuantityavail(int quantityavail) {
		this.quantityavail = quantityavail;
	}
	
	public String createStock(){
		Stock objstock=new Stock();
		String stockid=StockBAL.generateStockIdBal();
		objstock.setStockid(stockid);
		objstock.setItemName(itemname);
		objstock.setPrice(price);
		objstock.setQuantityAvail(quantityavail);
		return StockBAL.createStockItemNameBal(objstock);
	}

}
