package javaAdv.Day1.Assignment10a;
public class EmployeeGrade{
	private int employeeNo;
	private String employeeName;
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	private float averageFeedback;
	private char grade;
	
	public EmployeeGrade(){
		this.employeeNo = 101;
		this.employeeName = "Ram";
		this.customer1Feedback = 4.1f;
		this.customer2Feedback = 4.5f;
		this.customer3Feedback = 4.3f;
	}
	public void calculateAverageFeedback(){
		this.averageFeedback = (this.customer1Feedback+this.customer2Feedback+this.customer3Feedback)/3;
		
	}
	
	public void calculateGrade(){
		if(this.averageFeedback<2.5) this.grade = 'C';
		else if(this.averageFeedback>=2.5 && this.averageFeedback<4.0) this.grade = 'B';
		else this.grade = 'A';
	}
	public void displayInfo(){
		System.out.println("Employee ID " + this.employeeNo); 
		System.out.println("Employee Name " + this.employeeName); 
		System.out.println("Average feedback " + this.averageFeedback); 
		System.out.println("Grade " + this.grade);
	}
	
}