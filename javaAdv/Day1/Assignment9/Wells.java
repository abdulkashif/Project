package javaAdv.Day1.Assignment9;
public class Wells { 
 /** * Instantiate the EmployeeGrade. Set the values for the member * variables and invoke the method to calculate the average feedback * and grade. Invoke the method to display the employee information. * @param args The command line arguments */ 
 public static void main (String[] args) { 
	 EmployeeGrade elvis = new EmployeeGrade(); 
	 elvis.initializeEmpoyee(1234, "Kashif", 4.1f, 3.9f, 4.3f); 
	 elvis.calculateAverageFeedback();
	 elvis.calculateGrade();
	 elvis.displayInfo();
	 EmployeeGrade martha = new EmployeeGrade(); 
	 martha.initializeEmpoyee(1234, "Martha", 3.5f, 4.5f); 
	 martha.calculateAverageFeedback();
	 martha.calculateGrade();
	 martha.displayInfo();
	 } 
 }