package ProblemSet_9c;

/*Charge class stores a Service object and
 * a monetary charge and can calculate the VAT*/
public class Charge {
	/**stores a Service object.*/
	private Service service;
	/**stores the price of the service.*/
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
	/**
	 * calculates the VAT to be paid based
	 * on the amount being charged.
	 * @return vat
	 */
	public double calculateVAT() {
		double vat = 0;
		switch (service.getRate()) {
		case ZERO: //no VAT
			break;
		case LOW: //low VAT rate is 5%
			vat = this.charge * 0.05;
			break;
		case STANDARD: //standard VAT rate is 20%
			vat = this.charge * 0.2;
			break;
		default:
			break;
		}
		return vat;
	}
}
