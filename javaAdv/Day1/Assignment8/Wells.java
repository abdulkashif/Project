package javaAdv.Day1.Assignment8;
public class Wells { 
 /** * Instantiate the EmployeeGrade. Set the values for the member * variables and invoke the method to calculate the average feedback * and grade. Invoke the method to display the employee information. * @param args The command line arguments */ 
 public static void main (String[] args) { 
	 EmployeeGrade elvis = new EmployeeGrade(); 
	 elvis.initializeEmpoyee(1234, "Kashif", 3.5f, 4.5f, 4.3f); 
	 elvis.calculateAverageFeedback();
	 elvis.calculateGrade();
	 elvis.displayInfo();
	 } 
 }