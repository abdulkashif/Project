package javaAdvance.Day2.Ass16_AbstractClass;
public class WellsBank {

public static void main (String[] args) {
//Account acc = new Account();
Customer john = new Customer(1, "John", "texas", 50058) ;

SavingAccount johnSA = new SavingAccount(101,john,1000);

johnSA.deposit(1000);

System.out.println("Balance Available for "+johnSA.getCustomer().getCustomername()+":"+johnSA.balanceEnquiry());
transaction(johnSA, 1000);
System.out.println("After Transaction and before Withdraw balance Available  for "+johnSA.getCustomer().getCustomername()+": "+johnSA.balanceEnquiry());


Customer jenny = new Customer(3, "Jenny", "london", 7008) ;
CurrentAccount jennyOA = new  CurrentAccount(201,jenny,500,2000);
transaction(jennyOA, 1000);
System.out.println("Balance Available for "+jennyOA.getCustomer().getCustomername()+":"+jennyOA.balanceEnquiry());

}

public static void transaction(Account account, double amount) {
	account.deposit(amount);
	account.withdraw(100);
}
}