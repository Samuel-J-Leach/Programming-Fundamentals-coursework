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
		String regex = "G[0-9]{4}-[0-9]{4}-[0-9]{4}";
		return aN.matches(regex);
	}
	public String displayAccountDetails() {
		String aN = accountNumber;
		if (!checkAccountAccuracy(accountNumber)) {
			aN = "Invalid Account";
		}
		return "Gas Bill\n"
				+ " Account Number:" + aN + "\n"
				+ " Customer:" + customer.getName()
				+ ". " + customer.getSurname() + "\n"
				+ " Amount due:" + displayAmountDue();
	}
	public String displayAmountDue() {
		return "£" + String.format("%.2f", amount);
	}
}
