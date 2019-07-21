package javaAdv2.Day1.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerDB { 
	private List<Customer> customerList=new ArrayList<Customer>(); 

	 public boolean saveCustomer(Customer customer){ 
		 boolean status=false; 
		 status=customerList.add(customer); 
		 return status;
	 
	  } 
	 public List<Customer> getAllCustomers(){ 
		 return customerList; 
	 }
	 public Set<Integer> getLoanAvailedCustomers(){ 
		 Set<Integer> loanAvailedCustomers=new TreeSet<Integer>(); 
		 Iterator<Customer> customerIterator= customerList.iterator();
		 while(customerIterator.hasNext()){ //getting the customer object Customer 
			 Customer customer=customerIterator.next(); 
			 //checking if the loan is availed 
			 if(customer.isLoanAvailed()){ //adding the customer ids to the set 
				 loanAvailedCustomers.add(customer.getCustomerId()); 
			 } 
		 } //returning the set of customers who have availed the loan 
		 return loanAvailedCustomers; 
	}
}
			