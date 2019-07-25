package javaAdvance.Day2.Ass15_Dynamic_Binding;
public class WellsBank {

public static void main (String[] args) {

Customer john = new Customer(1, "John", "texas", 50058) ;

SavingAccount johnSA = new SavingAccount(101,john,1000);

johnSA.deposit(1000);

System.out.println("Balance Available for "+johnSA.getCustomer().getCustomername()+":"+johnSA.balanceEnquiry());
transaction(johnSA, 1000);
System.out.println("After Transaction and before Withdraw balance Available  for "+johnSA.getCustomer().getCustomername()+": "+johnSA.balanceEnquiry());
johnSA.withdraw(1600);
System.out.println("After Withdraw balance Available  for "+johnSA.getCustomer().getCustomername()+": "+johnSA.balanceEnquiry());



Customer jenny = new Customer(3, "Jenny", "london", 7008) ;
CurrentAccount jennyOA = new  CurrentAccount(201,jenny,500,2000);
jennyOA.deposit(1500);
System.out.println("Balance Available for "+jennyOA.getCustomer().getCustomername()+":"+jennyOA.balanceEnquiry());
jennyOA.withdrawAmount(1000);
System.out.println("Balance Available after withdraw for "+jennyOA.getCustomer().getCustomername()+":"+jennyOA.balanceEnquiry());
jennyOA.withdrawAmount(4000);
System.out.println("Balance Available after withdraw for "+jennyOA.getCustomer().getCustomername()+":"+jennyOA.balanceEnquiry());
jennyOA.withdrawAmount(3000);
System.out.println("Balance Available after withdraw for "+jennyOA.getCustomer().getCustomername()+":"+jennyOA.balanceEnquiry());

}

public static void transaction(Account account, double amount) {
	account.deposit(amount);
	//account.withdraw(100);
}
}