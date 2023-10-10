package ProblemSet_4b;

import java.util.Arrays;

public class Classroom {
	private String room;
	private static final int CAPACITY = 20;
	private Student [] students = new Student[CAPACITY];
	public Classroom(String r) {
		room = r;
	}
	public String getRoom() {
		return room;
	}
	public int getCapacity() {
		return CAPACITY;
	}
	public void addStudents(int index, char i, String s) {
		students[index] = new Student(i, s);
	}
	public String getSummary() {
		int num = (int) Arrays.stream(students).filter(e -> e != null).count();
		if (num == 0) {
			return "No students added";
		}
		String summary = "";
		for (int i = 0; i < num; i++) {
			summary += students[i].getStudentDetails();
		}
		System.out.println(summary);
		return summary;
	}
	public int howManyStudents() {
		int num = (int) Arrays.stream(students).filter(e -> e != null).count();
		System.out.println(num);
		return num;
	}
}
