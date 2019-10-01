package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deptno;
		String dname;
		System.out.println("enter dept no...");
		deptno = Integer.parseInt(sc.nextLine());
		System.out.println("department name");
		dname = sc.nextLine();
		String cmd = "update dept set dname=? where deptno=?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst= con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setInt(2, deptno);
			pst.executeUpdate();
			System.out.println("**record updated**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
