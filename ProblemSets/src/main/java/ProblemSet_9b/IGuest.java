package ProblemSet_9b;

/*defines which methods are to be
 * implemented for a guest class*/
public interface IGuest {
	/*creates a new Charge object and inserts
	 * it into the end of charges*/
	void addCharge(Service s, double c);
	/*calculates the total of all the charges
	 * a guest has without including VAT*/
	double calculateTotalChargeWithoutVAT();
	/*calculates only the total VAT to be
	 * paid from charges at a given rate*/
	double calculateVATChargeAtRate(VATRate r);
	/*calculates the total amount the guest
	 * has to pay including VAT*/
	double calculateTotalChargeIncVat();
	/*returns a string representation of the object in
	 * the format: "forename surname, address, phone number"*/
	@Override
	String toString();
}
