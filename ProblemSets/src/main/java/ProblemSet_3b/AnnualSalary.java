package ProblemSet_3b;

public class AnnualSalary {
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12570;
	private static final double BASIC = 50270;
	private static final double HIGHER = 125140;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	public double calculateTax() {
		double tax = 0;
		double tempSalary = salary;
		if (salary < PERSONAL_ALLOWANCE) {
			return 0;
		} else if (salary < BASIC) {
			tempSalary -= PERSONAL_ALLOWANCE;
			tax = tempSalary * 0.2;
		} else if (salary < HIGHER) {
			tempSalary -= BASIC;
			tax = (BASIC - PERSONAL_ALLOWANCE) * 0.2;
			tax += tempSalary * 0.4;
		} else {
			tempSalary -= HIGHER;
			tax = (BASIC - PERSONAL_ALLOWANCE) * 0.2;
			tax += (HIGHER - BASIC) * 0.4;
			tax += tempSalary * 0.45;
		}
		return tax;
	}
}
