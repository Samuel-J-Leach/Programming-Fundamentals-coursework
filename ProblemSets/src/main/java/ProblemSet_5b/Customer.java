package ProblemSet_5b;

public class Customer {
	private String name;
	private String surname;
	public Customer(String n, String s) {
		name = n;
		surname = s;
	}
	public char getName() {
		char output = name.charAt(0);
		return output;
	}
	public String getSurname() {
		return surname;
	}
	public String toString() {
		return name.substring(0, 1) + ". " + surname;
	}
}
