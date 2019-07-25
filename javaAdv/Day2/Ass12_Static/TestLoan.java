package javaAdvance.Day2.Ass12_Static;
public class TestLoan {
public static void main(String[] args) {
Loan loan = Loan.getLoanInstance();
System.out.println("Total number of objects :" +loan.getNumberofObjects());
}}