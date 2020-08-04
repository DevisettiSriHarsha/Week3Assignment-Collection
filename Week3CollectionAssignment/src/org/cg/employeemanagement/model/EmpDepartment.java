package org.cg.employeemanagement.model;

public class EmpDepartment {
	
	private Integer departmentId;
	private String departmentName;
	private String location;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getDepartmentId(Integer departmentId) {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "EmpDepartment [departmentId=" + departmentId + ", departmentName=" + departmentName + ", location="
				+ location + "]";
	}
	public EmpDepartment(Integer departmentId, String departmentName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}
	public EmpDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
