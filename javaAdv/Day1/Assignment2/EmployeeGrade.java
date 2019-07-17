package javaAdv.Day1.Assignment2;
public class EmployeeGrade { 
 /** * Calculates the average feedback of 5 employees and determines * their grade * @param args: Command line arguments */ 
	public static void main (String [] args) { 
		int employeeId[]={1001,1002,1003,1004,1005}; 
		float customer1Feedback[]={4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
		float customer2Feedback[]={3.3f, 2.8f, 4.8f, 3.9f, 1.9f};
		float customer3Feedback[]={2.8f, 3.0f, 3.7f, 2.9f, 4.9f};
		float averageFeedback[] = new float[5];
		char grade[] = new char[5];
		
		for(int i = 0;i<employeeId.length;i++) {
			float avg = (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
			averageFeedback[i]=avg;
			char gr;
			if(avg<2.5) gr = 'C';
			else if(avg>=2.5 & avg<=3.8) gr = 'B';
			else gr = 'C';
			grade[i] = gr;
		}
		for(int i = 0;i<employeeId.length;i++) {
			System.out.println("Employee id : "+employeeId[i]);
			System.out.println("average : "+averageFeedback[i]);
			System.out.println("Grade : "+grade[i]);
			System.out.println("*******************");
		}
	} 
}
