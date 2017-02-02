package com.revature.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.empapp.model.Employee;
import com.revature.empapp.util.ConnectionUtil;

public class EmployeeDAO {
	public void save(Employee employee){
JdbcTemplate jdbctemplate = ConnectionUtil.getJdbcTemplate();

String sql="insert into employee(name,designation) values (?,?)";

Object[] params = {employee.getName(),employee.getDesignation()};
int rows=jdbctemplate.update(sql,params);
System.out.println(rows);
}
}

