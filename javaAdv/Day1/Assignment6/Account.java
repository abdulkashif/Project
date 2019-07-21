package javaAdv.Day1.Assignment6;



public class Account {
	static int accNo;
	String firstName;
	String lastName;
	String email;
	String accType;
	String dob;
	char gender;
	String status;
	String checkBook;
	String atm;
	String discount;
	public Account(String fName, String lName, String dob, String email, String type, char gender, String status) {
		accNo++;
		this.firstName = fName;
		this.lastName = lName;
		this.dob = dob;
		this.email = email;
		this.accType = type;
		this.gender = gender;
		this.status = status;
		if(this.accType.equals("Salary")) {
			this.checkBook = "No";
			this.discount = "No";
			this.atm = "Yes";
		}else {
			this.checkBook = "No";
			this.discount = "Yes";
			this.atm = "Yes";
		}
	}
	
	public static void main(String[] args) {
		
		Account Employee1 = new Account("Paul", "Anderson", "10/04/1980", "pand@xyz.com", "Salary", 'M', "Single");
		Account Employee2 = new Account("James", "Garfield", "05/25/1978", "jgarfield@xyz.com", "Non-Salary", 'M', "Married");
	}

}
