package javaAdv.Day1.Assignment4;
public class Customer{
	private String customerID; 
	private String customerName; 
	private String address; 
	private int pinCode; 
	//statement 1 //statement 2 //statement 3 
	public static void main (String [] args){ 
		Customer customer = new Customer(); 
		customer.customerID = "1234"; 
		customer.customerName = "Jayant"; 
		customer.address = "iRVING TEXAS"; 
		customer.pinCode = 75063; 
		System.out.println("Customer ID " + customer.customerID); 
		System.out.println("Customer Name " + customer.customerName); 
		System.out.println("Customer Address " + customer.address); 
		System.out.println("Customer Pin Code " + customer.pinCode); 
		
	}
	
}