package ProblemSet_3b;

public class AnnualSalary {
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12570;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	public double calculateTax() {
		double tax = 0;
		double tempSalary = salary;
		final double BASIC = 50270;
		final double HIGHER = 125140;
		final double BASIC_RATE = 0.2;
		final double HIGHER_RATE = 0.4;
		final double ADDITIONAL_RATE = 0.45;
		if (salary < PERSONAL_ALLOWANCE) {
			return 0;
		} else if (salary < BASIC) {
			tempSalary -= PERSONAL_ALLOWANCE;
			tax = tempSalary * BASIC_RATE;
		} else if (salary < HIGHER) {
			tempSalary -= BASIC;
			tax = (BASIC - PERSONAL_ALLOWANCE) * BASIC_RATE;
			tax += tempSalary * HIGHER_RATE;
		} else {
			tempSalary -= HIGHER;
			tax = (BASIC - PERSONAL_ALLOWANCE) * BASIC_RATE;
			tax += (HIGHER - BASIC) * HIGHER_RATE;
			tax += tempSalary * ADDITIONAL_RATE;
		}
		return tax;
	}
}
