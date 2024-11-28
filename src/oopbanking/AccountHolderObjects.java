package oopbanking;

public class AccountHolderObjects {
	public static void main(String[] args) {
		
		AccountHolder acctHolder = new AccountHolder();
		
		acctHolder.firstName = "Tom";
		acctHolder.lastName = "";
		acctHolder.age = 26;
		acctHolder.accountBalance = 10000;
		System.out.println("Is " + acctHolder.firstName + " " + acctHolder.lastName + " eligible for a credit card? " + acctHolder.eligibleForCreditCard);
	}
}
