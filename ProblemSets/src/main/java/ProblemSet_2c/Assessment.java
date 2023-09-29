//Assessment.java

package ProblemSet_2c;

/*
 * a simple class that stores the name and mark of an assessment
 * @author Samuel Leach
 */

public class Assessment {
	private String name;
	private double mark;
	public Assessment (String givenName, double givenMark) {
		name = givenName;
		mark = givenMark;
	}
	public String getName() {
		return name;
	}
	public double getMark() {
		return mark;
	}
}
