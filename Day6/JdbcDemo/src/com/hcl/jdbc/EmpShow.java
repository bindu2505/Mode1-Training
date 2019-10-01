package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("connected");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Emp");
			while(rs.next()){
				System.out.println("employ no "+ rs.getInt("empno"));
				System.out.println("employ name " + rs.getString("ename"));
				System.out.println("job " + rs.getString("job"));
				System.out.println("manager no "+ rs.getInt("mgr"));
				System.out.println("Hiring Date " + rs.getDate("hiredate"));
				System.out.println("Salary" + rs.getInt("sal"));
				System.out.println("Comm " + rs.getInt("comm"));
				System.out.println("Department number " + rs.getInt("deptno"));
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


