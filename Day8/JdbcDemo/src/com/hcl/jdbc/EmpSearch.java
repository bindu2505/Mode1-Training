package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpSearch {
	public static void main(String[] args) {
		int empno;
		System.out.println("enter employ no...");
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			String cmd = "select * from Emp where empno=?";
			PreparedStatement  pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println("employ name  " + rs.getString("ename"));
				System.out.println("job  " + rs.getString("job"));
				System.out.println("manager num " + rs.getString("mgr"));
				System.out.println("hire date  " + rs.getString("hiredate"));
				System.out.println("salary" + rs.getString("sal"));
				System.out.println("com" + rs.getString("comm"));
				System.out.println("department num" + rs.getString("deptno"));
			} else { 
				System.out.println("***record not found***");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
