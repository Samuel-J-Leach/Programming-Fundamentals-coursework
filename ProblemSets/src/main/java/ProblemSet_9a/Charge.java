package ProblemSet_9a;

/*Charge class stores a Service object and
 * a monetary charge and can calculate the VAT*/
public class Charge {
	private Service service;
	private double charge;
	/*parameterised constructor, raises an
	 * exception if charge is less than 0*/
	public Charge(Service service, double charge)
			throws IllegalArgumentException {
		this.service = service;
		if (charge > 0) {
			this.charge = charge;
		} else {
			throw new IllegalArgumentException();
		}
	}
	/*returns the service attribute*/
	public Service getService() {
		return this.service;
	}
	/*returns the charge attribute*/
	public double getCharge() {
		return this.charge;
	}
	/*calculates the VAT to be paid based
	 * on the amount being charged*/
	public double calculateVAT() {
		double vat = 0;
		switch (service.getRate()) {
		case ZERO:
			break;
		case LOW:
			vat = this.charge * 0.05;
			break;
		case STANDARD:
			vat = this.charge * 0.2;
			break;
		default:
			break;
		}
		return vat;
	}
}
