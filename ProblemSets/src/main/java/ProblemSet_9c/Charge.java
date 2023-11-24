package ProblemSet_9c;

public class Charge {
	private Service service;
	private double charge;
	public Charge(Service service, double charge)
			throws IllegalArgumentException {
		this.service = service;
		if (charge > 0) {
			this.charge = charge;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public Service getService() {
		return this.service;
	}
	public double getCharge() {
		return this.charge;
	}
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
