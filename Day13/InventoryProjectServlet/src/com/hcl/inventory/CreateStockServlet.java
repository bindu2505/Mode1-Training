package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateStockServlet
 */
public class CreateStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher disp = request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		Stock objStock=new Stock();
		String stockid=new StockDAO().generateStockIdDao();
		objStock.setStockid(stockid);
		objStock.setItemName(request.getParameter("itemname"));
		double price=Double.parseDouble(request.getParameter("Price"));
		objStock.setPrice(price);
		int quantityavail=Integer.parseInt(request.getParameter("QuantityAvail"));
		objStock.setQuantityAvail(quantityavail);
		
		String result=StockBAL.createStockItemNameBal(objStock);
		
		out.println(result);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
