//Module.java

package ProblemSet_2c;

/*
 * a simple class that calculates the average of assessments in a module
 * @author Samuel Leach
 */

public class Module {
	private static final String NAME = "COM1027";
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;
	public Module(Assessment ass1, Assessment ass2, Assessment ass3) {
		assessment1 = ass1;
		assessment2 = ass2;
		assessment3 = ass3;
	}
	public double calculateAverage() {
		double average = assessment1.getMark();
		average += assessment2.getMark();
		average = (average / 2) * 0.4;
		average += (assessment3.getMark()) * 0.6;
		return average;
	}
	@Override
	public String toString() {
		double average = calculateAverage();
		return NAME + " (" + average + "%)";
	}
}
