package org.cg.employeemanagement.service;

import java.time.LocalDate;

public class EmployeeDetailsValidation {
	
	public boolean idValidation(String empId)
	{
		String pattern= "^[0-9]{5}_[A-Z]{2}$";
		return empId.matches(pattern);
				
	}
	public boolean nameValidation(String empname)
	{
		String pattern= "^[A-Za-z]{3,}$";
		return empname.matches(pattern);
				
	}
	public boolean salaryValidation(Double empsal)
	{
		if((empsal>=20000)&&(empsal<=500000)) {
			return true;
		}
		else {
			return false;
		}
				
	}
	public boolean dateValidation(String date) {
		
		LocalDate joinDate = LocalDate.parse(date);
		int flag = joinDate.compareTo(LocalDate.now());
		return (flag>=0);
	}
	

}
