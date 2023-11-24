package ProblemSet_9c;

public interface IGuest {
	public void addCharge(Service s, double c);
	public double calculateTotalChargeWithoutVAT();
	public double calculateVATChargeAtRate(VATRate r);
	public double calculateTotalChargeIncVat();
	@Override
	public String toString();
}
