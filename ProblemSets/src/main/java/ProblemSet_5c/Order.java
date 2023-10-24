package ProblemSet_5c;

import java.util.ArrayList;

public class Order {
	private ArrayList<Pizza> pizzas;
	private Customer customer;
	public Order(Customer customer) {
		this.customer = customer;
		this.pizzas = new ArrayList<Pizza>();
	}
	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	public double calculateTotal() {
		double total = 0.0;
		for (Pizza pizza : pizzas) {
			total += pizza.calculateCost();
		}
		return total;
	}
	public String printReceipt() {
		StringBuffer receipt = new StringBuffer();
		receipt.append("Customer: ");
		receipt.append(this.customer.toString());
		receipt.append("\nNumber of Pizzas: ");
		receipt.append(howManyPizzasInOrder());
		receipt.append("\nTotal Cost: ");
		receipt.append(String.format("%.2f", calculateTotal()));
		return receipt.toString();
	}
	public int howManyPizzasInOrder() {
		return this.pizzas.size();
	}
}
