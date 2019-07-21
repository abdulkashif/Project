package javaAdv.Day1.Assignment5;

import java.util.Date;

public class Account {
	String firstName;
	String lastName;
	String email;
	String accType;
	Date dob;
	char gender;
	String status;
	String checkBook;
	String atm;
	String discount;
	public Account(String fName, String lName, Date dob, String email, String type, char gender, String status) {
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

}
