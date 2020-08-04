package org.cg.employeemanagement.model;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDetails {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private Double salary;
	private String dateOfJoining;
	
	private EmpDepartment empDepartment;
	private HashSet<EmpAddress> adresses;
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		
			this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		
			this.firstName = firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		
			this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		
		this.salary = salary;	
		
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		
			this.dateOfJoining = dateOfJoining;
		
		
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", empDepartment=" + empDepartment
				+ ", adresses=" + adresses + "]";
	}
	public EmpDepartment getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(EmpDepartment empDepartment) {
		this.empDepartment = empDepartment;
	}
	public Set<EmpAddress> getAdresses() {
		return adresses;
	}
	public void setAdresses(HashSet<EmpAddress> adresses) {
		this.adresses = (HashSet<EmpAddress>) adresses;
	}
	public EmployeeDetails(String employeeId, String firstName, String lastName, Double salary, String dateOfJoining,
			EmpDepartment empDepartment, HashSet<EmpAddress> adresses) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.empDepartment = empDepartment;
		this.adresses = adresses;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
