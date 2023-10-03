package ProblemSet_3c;

import ProblemSet_3a.Position;
import ProblemSet_3b.AnnualSalary;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position positionName;
	public Employee(int pId, String pFn, String pSn,
			AnnualSalary pS, Position pPn) {
		id = pId;
		forename = pFn;
		surname = pSn;
		salary = pS;
		positionName = pPn;
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
		return positionName.getRoleName();
	}
	public String toString() {
		String bonus = "";
		double tempSalary = salary.getSalary();
		double tax = salary.calculateTax();
		String roleName = positionName.getRoleName();
		if (tempSalary < 100000) {
			bonus = " not";
		}
		String msg = surname + ", " + forename + " (" + id + "): "
				+ roleName + " at �" + tempSalary + " (�" + tax + " tax)"
						+ " and is" + bonus + " eligible for bonus.";
		System.out.println(msg);
		return msg;
	}
}
