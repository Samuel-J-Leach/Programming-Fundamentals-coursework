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
	
	public Student(String Forename, String Surname, int Age) {
		forename = Forename;
		surname = Surname;
		age = Age;
	}
	
	public String getFullname() {
		return forename + " " + surname;
	}
	
	public void setForename(String Forename) {
		forename = Forename;
	}
	
	public void setSurname(String Surname) {
		surname = Surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int Age) {
		age = Age;
	}
}
