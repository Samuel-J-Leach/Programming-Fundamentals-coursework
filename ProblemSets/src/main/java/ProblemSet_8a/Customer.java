package ProblemSet_8a;

public class Customer {
	private String name;
	private String surname;
	public Customer(String name, String surname)
			throws IllegalArgumentException {
		if (this.validateInfo(name)
				&& this.validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public char getName() {
		return this.name.charAt(0);
	}
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean validateInfo(String info) {
		boolean valid = false;
		if (info.matches("[A-Z]{1}[a-z]*")) {
			valid = true;
		}
		return valid;
	}
	@Override
	public String toString() {
		StringBuffer details = new StringBuffer();
		details.append(this.getName());
		details.append(". ");
		details.append(this.surname);
		return details.toString();
	}
}
