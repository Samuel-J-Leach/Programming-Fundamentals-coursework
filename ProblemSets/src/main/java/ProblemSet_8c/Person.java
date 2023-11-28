package ProblemSet_8c;

/*Person class stores the forename,
 * surname, and age of a person*/
public class Person {
	private String forename;
	private String surname;
	private int age;
	/*parameterised constructor with no validation*/
	public Person(String forename, String surname, int age) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
	/*returns the forename attribute*/
	public String getForename() {
		return this.forename;
	}
	/*returns the surname attribute*/
	public String getSurname() {
		return this.surname;
	}
	/*returns the age attribute*/
	public int getAge() {
		return this.age;
	}
	/*returns a string representation of the
	 * object in the format: "forename surname (age)"*/
	@Override
	public String toString() {
		StringBuffer details = new StringBuffer();
		details.append(this.forename);
		details.append(" ");
		details.append(this.surname);
		details.append(" (");
		details.append(this.age);
		details.append(")");
		return details.toString();
	}
}
