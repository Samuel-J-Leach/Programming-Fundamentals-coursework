package ProblemSet_8c;

public class Person {
	private String forename;
	private String surname;
	private int age;
	public Person(String forename, String surname, int age) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
	public String getForename() {
		return this.forename;
	}
	public String getSurname() {
		return this.surname;
	}
	public int getAge() {
		return this.age;
	}
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
