//Food.java

package ProblemSet_2b;

/*
 * a simple class that stores information about food items
 * @author Samuel Leach
 */

public class Food {
	
	private String name = "";
	private double amountOfSugar = 0.0;
	
	public Food(String Name, double AmountOfSugar) {
		name = Name;
		amountOfSugar = AmountOfSugar;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
}
