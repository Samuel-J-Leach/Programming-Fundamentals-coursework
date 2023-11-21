package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;
	public Guest(String f, String s, String a, String t) {
		this.forename = f;
		this.surname = s;
		this.address = a;
		this.telephone = t;
		this.charges = new ArrayList<Charge>();
	}
	public void addCharge(Service s, double c) {
		this.charges.add(new Charge(s, c));
	}
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getCharge();
		}
		return total;
	}
	public double calculateVATChargeAtRate(VATRate r) {
		double total = 0;
		double vat = 0;
		switch (r) {
		case ZERO:
			break;
		case LOW:
			vat = 0.05;
			break;
		case STANDARD:
			vat = 0.2;
			break;
		default:
			break;
		}
		for (Charge charge : this.charges) {
			if (charge.getService().getRate() == r) {
				total += charge.getCharge() * vat;
			}
		}
		return total;
	}
	public double calculateTotalChargeIncVAT() {
		double total = 0;
		total += this.calculateTotalChargeWithoutVAT();
		total += this.calculateVATChargeAtRate(VATRate.LOW);
		total += this.calculateVATChargeAtRate(VATRate.STANDARD);
		return total;
	}
	@Override
	public String toString() {}
}
