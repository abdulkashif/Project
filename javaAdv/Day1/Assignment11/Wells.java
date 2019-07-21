package javaAdv.Day1.Assignment11;
public class Wells { 
 /** * Instantiate the EmployeeGrade. Set the values for the member * variables and invoke the method to calculate the average feedback * and grade. Invoke the method to display the employee information. * @param args The command line arguments */ 
 public static void main (String[] args) { 
	 EmployeeGrade [] employee = new EmployeeGrade[5];
	 employee[0] = new EmployeeGrade(102,"James",3.2f,4.4f,2.1f); 
	 employee[1] = new EmployeeGrade(103,"Martin",3.2f,3.4f,3.2f);
	 employee[2] = new EmployeeGrade(104,"Zoro",3.8f,4.7f,3.1f);
	 employee[3] = new EmployeeGrade(105,"Tony",4.2f,2.4f,2.2f);
	 employee[4] = new EmployeeGrade(106,"Smith",2.9f,2.6f,4.1f);
	
	 for(int i=0;i<employee.length;i++) {
		 employee[i].calculateAverageFeedback();
		 employee[i].calculateGrade();
		 employee[i].displayInfo();
		 System.out.println("*******************");
	 }
	 } 
 }