//Student.java

package ProblemSet_2a;

/*
 * a simple class that stores the name and age of students
 * @author Samuel Leach
 */

public class Student {
	private String forename = "";
	private String surname = "";
	private int age = 0;
	public Student(String givenForename, 
			String givenSurname, int givenAge) {
		forename = givenForename;
		surname = givenSurname;
		age = givenAge;
	}
	public String getFullname() {
		return forename + " " + surname;
	}
	public void setForename(String newForename) {
		forename = newForename;
	}
	public void setSurname(String newSurname) {
		surname = newSurname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
}
