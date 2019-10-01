package com.hcl.department;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertDepartment(){
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department no  ");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Department Name   ");
		dname=sc.nextLine();
		System.out.println("Location  ");
		loc=sc.nextLine();
		System.out.println("Head  ");
		head=sc.nextLine();
		String cmd="insert into department values(?,?,?,?)";
		jdbcTemplate.update(cmd,new Object[]{
				deptno,
				dname,
				loc,
				head
		});
	}

}
