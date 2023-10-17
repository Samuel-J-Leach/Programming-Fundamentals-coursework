package ProblemSet_5b;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	public GasBill(String aN, double a, Customer c) {
		accountNumber = aN;
		amount = a;
		customer = c;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getCustomer() {
		return customer.toString();
	}
	public boolean checkAccountAccuracy(String aN) {
		boolean valid = True;
		if (aN.charAt(0) != "G") {
			valid = false;
		}
		aN = aN.substring(1);
		
	}
	public String displayAccountDetails() {}
	public String displayAmountDue() {}
}
