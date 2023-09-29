//Meal.java

package ProblemSet_2b;

/*
 * a simple class that calculates the total sugar level of a meal (2 items of food)
 * and returns a message containing the food names
 * @author Samuel Leach
 */

public class Meal {
	private Food mainCourse;
	private Food dessert;
	public Meal(Food givenMainCourse, Food givenDessert) {
		mainCourse = givenMainCourse;
		dessert = givenDessert;
	}
	public double calculateTotalSugarLevel() {
		double totalSugarLevel = 0;
		totalSugarLevel = 
				mainCourse.getAmountOfSugar() + dessert.getAmountOfSugar();
		return totalSugarLevel;
	}
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName()
		+ ", dessert = " + dessert.getName() + "]";
	}
}
