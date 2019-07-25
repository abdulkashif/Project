package javaAdvance.Day2.Ass15_Dynamic_Binding;

public class Customer {
	
	private int customerId;
	
	private String customername;
	private String customerAddress;
	private int pincode;
	
	Customer(){}
	
	Customer(int customerId,String customername,String customerAddress,int pincode){
		this.customerId=customerId;
		this.customername=customername;
		this.customerAddress=customerAddress;
		this.pincode=pincode;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
