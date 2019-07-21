package javaAdv.Day3.Assignment22;

import java.util.Vector;

public class EmployeeInfo{
	
	public static void main (String[] args) { 
		//Vector is in java.util package. Refer javaDocs 
		Vector empList = new Vector(); 
		int empNo=1000; 
		for(int count=0;count<5;count++) { 
			empNo++; 
			Integer emp = (Integer) empNo;
			empList.add(emp);
			// Only object can be added to the vector. 
			// Convert the int to Integer 
			// To-do: add the empNo to the vector 
		}
		for(int i=0;i<empList.size();i++) {
			System.out.println(empList.get(i));
		}
	 } 
	
	 // To-do: retrieve and display the elements in vector } 
	
	
}