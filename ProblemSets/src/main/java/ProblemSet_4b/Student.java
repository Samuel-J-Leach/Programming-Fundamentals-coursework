package ProblemSet_4b;

public class Student {
	private char initial;
	private String surname;
	public Student(char i, String s) {
		initial = i;
		surname = s;
	}
	public String getStudentDetails() {
		return initial + ". " + surname + "\n";
	}
}
