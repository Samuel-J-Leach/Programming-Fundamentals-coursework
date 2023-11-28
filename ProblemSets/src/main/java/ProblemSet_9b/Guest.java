package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

/*Guest class stores a guest's forename,
 * surname, address, phone number, and a
 * list of charges to be paid*/
public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;
	/*parameterized constructor with no validation*/
	public Guest(String f, String s, String a, String t) {
		this.forename = f;
		this.surname = s;
		this.address = a;
		this.telephone = t;
		//default value
		this.charges = new ArrayList<Charge>();
	}
	/*returns the forename attribute*/
	public String getForename() {
		return this.forename;
	}
	/*returns the surname attribute*/
	public String getSurname() {
		return this.surname;
	}
	/*returns the address attribute*/
	public String getAddress() {
		return this.address;
	}
	/*returns the telephone attribute*/
	public String getTelephone() {
		return this.telephone;
	}
	/*returns the charges attribute*/
	public List<Charge> getCharges() {
		return this.charges;
	}
	/*creates a new Charge object and inserts
	 * it into the end of charges*/
	public void addCharge(Service s, double c) {
		this.charges.add(new Charge(s, c));
	}
	/*calculates the total of all the charges
	 * a guest has without including VAT*/
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getCharge();
		}
		return total;
	}
	/*calculates only the total VAT to be
	 * paid from charges at a given rate*/
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
		/*loops through every charge and adds the
		 * VAT to be paid to the total*/
		for (Charge charge : this.charges) {
			if (charge.getService().getRate() == r) {
				total += charge.getCharge() * vat;
			}
		}
		return total;
	}
	/*calculates the total amount the guest
	 * has to pay including VAT*/
	public double calculateTotalChargeIncVat() {
		double total = 0;
		total += this.calculateTotalChargeWithoutVAT();
		total += this.calculateVATChargeAtRate(VATRate.LOW);
		total += this.calculateVATChargeAtRate(VATRate.STANDARD);
		return total;
	}
	/*returns a string representation of the object in
	 * the format: "forename surname, address, phone number"*/
	@Override
	public String toString() {
		StringBuffer details = new StringBuffer();
		details.append(this.forename);
		details.append(" ");
		details.append(this.surname);
		details.append(", ");
		details.append(this.address);
		details.append(", ");
		details.append(this.telephone);
		return details.toString();
	}
}
