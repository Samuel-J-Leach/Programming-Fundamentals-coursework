package ProblemSet_5b;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	public GasBill(String accountNumber,
			double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public String getCustomer() {
		return this.customer.toString();
	}
	public boolean checkAccountAccuracy(String accountNumber) {
		String regex = "G[0-9]{4}-[0-9]{4}-[0-9]{4}";
		return accountNumber.matches(regex);
	}
	public String displayAccountDetails() {
		String accountNumber = this.accountNumber;
		if (!checkAccountAccuracy(accountNumber)) {
			accountNumber = "Invalid Account";
		}
		return "Gas Bill\n"
				+ " Account Number:" + accountNumber + "\n"
				+ " Customer:" + customer.getName()
				+ ". " + customer.getSurname() + "\n"
				+ " Amount due:" + displayAmountDue();
	}
	public String displayAmountDue() {
		return "£" + String.format("%.2f", this.amount);
	}
}
