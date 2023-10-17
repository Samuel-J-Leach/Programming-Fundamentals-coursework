package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module [] modules = new Module[8];
	public Student(char i, String s) {
		initial = i;
		surname = s;
	}
	public int calculateYearAverage() {
		double total = 0;
		int amount = 0;
		for (int i=0; i<modules.length; i++) {
			if (modules[i] != null) {
				total += modules[i].getAverage();
				amount += 1;
			}
		}
		int average = (int) total / amount;
		return average;
	}
	public String displayArray() {
		String array = "";
		Module module;
		for (int i = 0; i < modules.length; i++) {
			module = modules[i];
			if (module != null) {
				array += module.getCode() + ": "
						+ module.getAverage() + "\n";
			}
		}
		array += "Year Average: "
				+ calculateYearAverage() + "%";
		return array;
	}
	public Module getModules(int index) {
		return modules[index];
	}
	public String getStudentDetails() {
		String details = initial + ". "
				+ surname + " "
				+ calculateYearAverage() + "%";
		return details;
	}
	public void setModules(int index, String code, double average) {
		modules[index] = new Module(code, average);
	}
}
