package ProblemSet_9b;

public interface IGuest {
	public void addCharge(Service s, double c);
	public double calculateTotalChargeWithoutVAT();
	public double calculateVATChargeAtRate(VATRate r);
	public double calculateTotalChargeIncVAT();
	@Override
	public String toString();
}
