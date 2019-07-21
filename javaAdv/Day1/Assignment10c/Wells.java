package javaAdv.Day1.Assignment10c;
public class Wells { 
 /** * Instantiate the EmployeeGrade. Set the values for the member * variables and invoke the method to calculate the average feedback * and grade. Invoke the method to display the employee information. * @param args The command line arguments */ 
 public static void main (String[] args) { 
	 //EmployeeGrade ram = new EmployeeGrade(); 
	 EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f); 
	 //ram.calculateAverageFeedback();
	 //ram.calculateGrade();
	 james.calculateAverageFeedback();
	 james.calculateGrade();
	 //ram.displayInfo();
	 james.displayInfo();
	 } 
 }