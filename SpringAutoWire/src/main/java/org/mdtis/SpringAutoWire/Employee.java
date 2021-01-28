package org.mdtis.SpringAutoWire;



public class Employee {
	
	private String empId;
	private String name;
	private String phoneNumber;
	
	private Address tempAddress;
	private Address perAddress;
	
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getTempAddress() {
		return tempAddress;
	}
	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}


	public Address getPerAddress()  { 
	 return perAddress; 
    } 
 
    public void setPerAddress(Address perAddress) { 
	 this.perAddress = perAddress; 
	}
	 
	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", name = " + name + ", phoneNumber = "  + phoneNumber +" \n "+ " Temporary Address = "
				+ tempAddress +" \n " +" Permanent Address = "+ perAddress + " ]";
	}
	
	
	

}
