package javaAdvance.Day2.Ass12_Static;

public class Loan {
	
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	private static int loanCounter;  //made private in 8.c step 5
	
	static {loanCounter =100;}
	
	private Loan(){loanCounter++;}
	private Loan(int accountNo, int cusomerNo,int loanduration, float loanAmount,float interest){loanCounter++;}
	

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	
	public float getInterest() {
		return interest;
	}
	
	public int getAccountNo() {
		return accountNo;}
	

	public int getNumberofObjects() {return loanCounter;}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

		
	public float calculateInstallments() {
		return loanAmount;}
	
//below main method is for Assignment 8-A & 8-B	
//	public static void main(String[] args) {
//		
//		Loan loan = new Loan();
//		Loan loan1 = new Loan();
//		Loan loan2 = new Loan();
//		Loan loan3 = new Loan();
//		Loan loan4 = new Loan();
//		Loan loan5 = new Loan(1,2,3,4,5);
//		
//		System.out.println("Number of instances :"+loanCounter);
//	
//	}
	
	
	///below are for Assignment C
	public static Loan getLoanInstance(){
		return new Loan();}

}
