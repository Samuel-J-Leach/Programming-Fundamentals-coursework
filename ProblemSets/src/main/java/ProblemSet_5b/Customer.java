package ProblemSet_5b;

public class Customer {
	private String name;
	private String surname;
	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public char getName() {
		char output = this.name.charAt(0);
		return output;
	}
	public String getSurname() {
		return this.surname;
	}
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(this.name.substring(0, 1));
		str.append(". ");
		str.append(this.surname);
		return str.toString();
	}
}
