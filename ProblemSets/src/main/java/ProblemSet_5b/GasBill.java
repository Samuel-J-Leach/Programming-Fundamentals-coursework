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
		boolean valid = true;
		if (aN.charAt(0) != 'G') {
			valid = false;
		}
		aN = aN.substring(1);
		String[] numbers = aN.split("-");
		if (numbers.length != 3) {
			valid = false;
		}
		for (String i : numbers) {
			if (i.length() != 4) {
				valid = false;
			}
			try {
				Integer.parseInt(i);
			}
			catch (Exception e) {
				valid = false;
			}
		}
		return valid;
		/*
		 * alternate solution:
		 * String regex = "G\\d{4}-\\d{4}-\\d{4}";
		 * return aN.matches(regex);
		 */
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
