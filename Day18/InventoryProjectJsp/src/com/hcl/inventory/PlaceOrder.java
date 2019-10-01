package com.hcl.inventory;

public class PlaceOrder {
	private String stockid;
	private int qtyord;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	
	public String placeOrder(){
		return StockBAL.placeOrderBal(stockid, qtyord);
	}

}
