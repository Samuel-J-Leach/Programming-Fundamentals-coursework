package ProblemSet_3c;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	public Employee(int pId, String pFn, String pSn,
			AnnualSalary salary2,
			Position cPos) {
		id = pId;
		forename = pFn;
		surname = pSn;
		salary = salary2;
		companyPosition = cPos;
	}
	public int getId() {
		return id;
	}
	public String getForename() {
		return forename;
	}
	public String getSurname() {
		return surname;
	}
	public double getSalary() {
		return salary.getSalary();
	}
	public String getPositionName() {
		return companyPosition.getRoleName();
	}
	public boolean eligbleForBonus() {
		if (salary.getSalary() < 100000) {
			return false;
		}
		return true;
	}
	public String toString() {
		String bonus = "";
		double tempSalary = salary.getSalary();
		double tax = salary.calculateTax();
		String roleName = companyPosition.getRoleName();
		if (!eligbleForBonus()) {
			bonus = " not";
		}
		String msg = surname + ", " + forename
				+ " (" + id + "): "
				+ roleName + " at �" + tempSalary
				+ " (�" + tax + " tax)"
				+ " and is" + bonus
				+ " eligible for bonus.";
		System.out.println(msg);
		return msg;
	}
}
