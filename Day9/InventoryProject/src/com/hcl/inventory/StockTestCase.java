package com.hcl.inventory;


import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;


public class StockTestCase {
	@Test
	public void testPlaceOrder(){
		assertEquals("Order Placed Successfully...", StockBAL.placeOrderBal("S003", 1));
		assertEquals("Insufficent Quantity...", StockBAL.placeOrderBal("S002", 1));
		assertEquals("StockID not found...", StockBAL.placeOrderBal("N001", 1));
	}
	
	@Test
	public void testGenerateOrderId(){
		Connection con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1"
				+ " else max(orderid)+1 "
				+ "end orderid from orders";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			
	 			ResultSet rs=pst.executeQuery();
	 			rs.next();
	 			orderid=rs.getInt("orderid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(orderid, StockBAL.generateOrderidBal());
	}
	
	@Test
	public void testSearchStock(){
		assertNotNull(StockBAL.searchStockBal("S002"));
		assertNull(StockBAL.searchStockBal("S090"));
	}
	
	 
	@Test
	public void testCreateStockItemName(){ 
		Stock stock = new Stock();
		String stockid= StockBAL.generateStockIdBal();
		stock.setStockid(stockid);
		stock.setItemName("mouse");
		stock.setPrice(250.00);
		stock.setQuantityAvail(4);
		assertEquals("stock added.....", StockBAL.createStockItemNameBal(stock));
	} 
	
	@Test
	public void testGenerateStockId(){
		String stid = null;
		Connection con = DaoConnection.getConnection();
		String cmd = "select max(stockId) sid from stock";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			stid= rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
			String formatted = String.format("%03d", id);
			stid = "S" + formatted;
//			if(id >= 1 && id <= 9){
//				stid = "S00" + id; 
//			}
//			if(id >= 11 && id <= 99){
//				stid = "S0" + id;
//			}
//			if(id >= 100 && id <= 999){
//				stid = "S" + id;
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		assertEquals(stid, StockBAL.generateStockIdBal());
	}
	
	@Test
	public void testDaoconection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	
	

	@Test
	public void testGettersAndSetters(){
		Stock stock = new Stock();
		stock.setStockid("S002");
		stock.setItemName("laptop");
		stock.setPrice(5646.00);
		stock.setQuantityAvail(10);
		
		assertEquals("S002", stock.getStockid());
		assertEquals("laptop", stock.getItemName());
		assertEquals(5646.00, stock.getPrice(),0.00);
		assertEquals(10, stock.getQuantityAvail());
		
	}

}
