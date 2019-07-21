package javaAdv2.Day1.Assignment4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WellsBank { 
	private static final CustomerDB customerDB=new CustomerDB();
	private static final Login login=new Login(); 
	public static void main(String[] args) { 
		Customer cust1=new Customer(11,"Tanya",false); 
		customerDB.saveCustomer(cust1); 
		login.addLogin(12, "IMCS@123"); 
		 Customer cust2=new Customer(12,"Johny",true); 
		 customerDB.saveCustomer(cust2); 
		 login.addLogin(12, "IMCS@123"); 
		 Customer cust3=new Customer(13,"Sameer",true); 
		 customerDB.saveCustomer(cust3);  
		 login.addLogin(13, "IMCS@123"); 
		 Customer cust4=new Customer(14,"Rajesh",false); 
		 customerDB.saveCustomer(cust4); 
		 login.addLogin(14, "Wells123");  
		 List<Customer> customerList=customerDB.getAllCustomers(); 
		 if(customerList.isEmpty()){  
		 System.out.println("There are no Customers in the Bank"); 
		 }else{ 
			 printCustomerList(customerList);
		 }
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers(); 
		System.out.println("\nCustomers who have Availed the loan ");  
		 
		 System.out.println(" "); 
		 for(int custId:loanAvailedCustomers){ 
			 System.out.println(custId); 
		 }
	}
	public static void printCustomerList(List<Customer> customerList){ 
		Iterator<Customer> custIterator = customerList.iterator(); 
		System.out.println(" Customer Details"); 
		while(custIterator.hasNext()){ 
			Customer customer=custIterator.next(); 
			System.out.print(customer.getCustomerId()+"\n"); 
			System.out.print(customer.getCustomerName()+ "\n");
			String displayString="NO"; 
			if(customer.isLoanAvailed()){ 
				displayString="YES"; 
				} 
	System.out.println(displayString); } } 
	}
