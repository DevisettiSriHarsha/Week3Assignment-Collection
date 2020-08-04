package org.cg.employeemanagement.model;

public class EmpAddress {
	
	private Integer addressId;
	private String adressLine1;
	private String city;
	private String state;
	
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAdressLine1() {
		return adressLine1;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "EmpAddress [addressId=" + addressId + ", adressLine1=" + adressLine1 + ", city=" + city + ", state="
				+ state + "]";
	}
	public EmpAddress(Integer addressId, String adressLine1, String city, String state) {
		super();
		this.addressId = addressId;
		this.adressLine1 = adressLine1;
		this.city = city;
		this.state = state;
	}
	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
