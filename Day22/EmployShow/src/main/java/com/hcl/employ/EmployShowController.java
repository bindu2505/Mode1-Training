package com.hcl.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployShowController {

	@RequestMapping("/EmployShow")
	public ModelAndView showEmp() {
		ApplicationContext ctx=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=
		(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql="select * from employ";
		List emps=null;
		emps=jt.query(sql,new RowMapper() {
			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("empno")+"----"+
							rs.getString("name") +"----"+
						    rs.getString("dept") +"----"+
							rs.getString("desig")+"----"+
						    rs.getString("basic");
				return empInfo;
			}
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	
	
	@RequestMapping("/empsearch")
	public ModelAndView showEmp(HttpServletRequest req) {
		int empno=Integer.parseInt(req.getParameter("empno"));
		ApplicationContext ctx=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=
		(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql="select * from employ where empno=?";
		List emps=null;
		emps=jt.query(sql,new Object[]{empno},  new RowMapper() {
			
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("empno")+"----"+
							rs.getString("name") +"----"+
						    rs.getString("dept") +"----"+
							rs.getString("desig")+"----"+
						    rs.getString("basic");
				return empInfo;
			}
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	
	
	@RequestMapping("/EmployInsert")
	public ModelAndView insertEmploy(HttpServletRequest req) {
		int empno=Integer.parseInt(req.getParameter("empno"));
		String name=req.getParameter("name");
		String dept=req.getParameter("dept");
		String desig=req.getParameter("desig");
		int basic=Integer.parseInt(req.getParameter("basic"));
		ApplicationContext ctx=new
		ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource=
		(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql="insert into employ values(?,?,?,?,?)";
		List emps=null;
		jt.update(sql,new Object[]{empno,name,dept,desig,basic});  
		return (new ModelAndView("InsertPage","messsage","Record inserted....."));
	}
	}

	
