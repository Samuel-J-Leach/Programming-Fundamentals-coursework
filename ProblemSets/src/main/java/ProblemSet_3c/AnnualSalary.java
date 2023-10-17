package ProblemSet_3c;

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
		if (salary < PERSONAL_ALLOWANCE) {
			return 0;
		} else if (salary < 50270) {
			tempSalary -= PERSONAL_ALLOWANCE;
			tax = tempSalary * 0.2;
		} else if (salary < 125140) {
			tempSalary -= 50270;
			tax = (50270 - PERSONAL_ALLOWANCE) * 0.2;
			tax += tempSalary * 0.4;
		} else {
			tempSalary -= 125140;
			tax = (50270 - PERSONAL_ALLOWANCE) * 0.2;
			tax += (125140 - 50270) * 0.4;
			tax += tempSalary * 0.45;
		}
		return tax;
	}
}
