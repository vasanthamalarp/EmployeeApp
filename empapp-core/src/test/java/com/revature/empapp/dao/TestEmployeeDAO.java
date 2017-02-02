package com.revature.empapp.dao;

import com.revature.empapp.model.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		
		employee.setId(1);
		employee.setName("vasantha");
		employee.setDesignation("developer");
	
		EmployeeDAO employeedao = new EmployeeDAO();
		employeedao.save(employee);
		
	}

}
