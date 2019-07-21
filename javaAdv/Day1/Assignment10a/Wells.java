package javaAdv.Day1.Assignment10a;
public class Wells { 
 /** * Instantiate the EmployeeGrade. Set the values for the member * variables and invoke the method to calculate the average feedback * and grade. Invoke the method to display the employee information. * @param args The command line arguments */ 
 public static void main (String[] args) { 
	 EmployeeGrade ram = new EmployeeGrade(); 
	 ram.calculateAverageFeedback();
	 ram.calculateGrade();
	 ram.displayInfo();
	 } 
 }