package ProblemSet_5c;

import java.util.Arrays;

public class Pizza {
	private String[] toppings = new String[10];
	public Pizza() {
		super();
	}
	public void addToppings(String[] toppings) {
		this.toppings = toppings;
	}
	public String printToppings() {
		String toppings = "";
		for (String topping : this.toppings) {
			toppings += "," + topping;
		}
		return toppings.substring(1);
	}
	public double calculateCost() {
		int num = (int) Arrays.stream(this.toppings).
				filter(e -> e != null).count();
		double cost = 0.0;
		if (num == 0) {
			cost = 0.0;
		} else if (num == 1) {
			cost = 9.99;
		} else if (num == 2 || num == 3) {
			cost = 10.99;
		} else if (num == 4 || num == 4) {
			cost = 11.99;
		} else if (num == 6) {
			cost = 12.99;
		} else if (num == 7) {
			cost = 13.99;
		} else if (num == 8) {
			cost = 14.99;
		} else if (num == 9) {
			cost = 15.99;
		} else if (num == 10) {
			cost = 14.99;
		}
		return cost;
	}
}
