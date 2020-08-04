package org.cg.employeemanagement.repository;

import java.util.ArrayList;
import java.util.List;
import org.cg.employeemanagement.model.EmployeeDetails;

public class Repository {
	
	List<EmployeeDetails> employees = new ArrayList<EmployeeDetails>();

	public void setEmployees(EmployeeDetails emp) {
		employees.add(emp);
		System.out.println("Employee is created");
		
	}

	public List<EmployeeDetails> getEmployees() {
		return employees;
	}
	
}
