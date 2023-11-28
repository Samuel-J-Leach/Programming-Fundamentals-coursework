package ProblemSet_8a;

/*Customer class stores the name and surname of
 * a customer and uses validation to ensure only
 * valid Customer objects can be created*/
public class Customer {
	private String name;
	private String surname;
	/*Customer object can only be created if the name
	 * and surname start with a capital letter which is
	 * followed by 0 or more lower case letters, else 
	 * an exception is raised.*/
	public Customer(String name, String surname)
			throws IllegalArgumentException {
		super();
		if (this.validateInfo(name)
				&& this.validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
		} else {
			throw new IllegalArgumentException();
		}
	}
	/*returns the first character of the name attribute*/
	public char getName() {
		return this.name.charAt(0);
	}
	/*returns the surname attribute*/
	public String getSurname() {
		return this.surname;
	}
	/*updates the surname attribute*/
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/*returns true if info starts with a capital letter
	 * which is followed by lower case letters*/
	public boolean validateInfo(String info) {
		boolean valid = false;
		if (info.matches("[A-Z]{1}[a-z]*")) {
			valid = true;
		}
		return valid;
	}
	/*returns a string representation of the object in
	 * the form: "initial. surname"*/
	@Override
	public String toString() {
		StringBuffer details = new StringBuffer();
		details.append(this.getName());
		details.append(". ");
		details.append(this.surname);
		return details.toString();
	}
}
