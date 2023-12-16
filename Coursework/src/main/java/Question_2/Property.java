package Question_2;

import java.util.HashMap;
import java.util.Map;

public abstract class Property {
	private int houseNumber = 0;
	private String street = null;
	private String city = null;
	private String postCode = null;
	private int numberOfRooms = 0;
	protected Map<Room, ITenant> rooms = null;
	protected double councilTax = 0.0;
	public Property(int h, String s, String c, String p, int n) {
		super();
		if (h == 0 || s == null || c == null || p == null || n == 0) {
			throw new NullPointerException();
		} else if (!this.validatePostCode(p) || !this.validateCity(c)) {
			throw new IllegalArgumentException();
		} else {
			this.houseNumber = h;
			this.street = s;
			this.city = c;
			this.postCode = p;
			this.numberOfRooms = n;
			this.rooms = new HashMap<Room, ITenant>();
			this.councilTax = 0.0;
		}
	}
	public int getHouseNumber() {
		return this.houseNumber;
	}
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getPostCode() {
		return this.postCode;
	}
	public double getCouncilTax() {
		return this.councilTax;
	}
	public int getNumberOfRooms() {
		return this.numberOfRooms;
	}
	public int getAvailableRooms() {
		return this.numberOfRooms - this.rooms.size();
	}
	public void setCouncilTax(double tax) {
		int students = 0;
		int professionals = 0;
		for (Map.Entry<Room, ITenant> room : this.rooms.entrySet()) {
			if (room.getValue().getType() == TenantType.STUDENT) {
				students++;
			} else if (room.getValue().getType()
					== TenantType.PROFESSIONAL) {
				professionals++;
			}
		}
		double councilTax = 0.0;
		if (professionals == 0 && students == 0) {
			councilTax = tax;
		} else if (professionals == 0 && students > 0) {
			councilTax = 0.0;
		} else if (professionals == 1) {
			councilTax = 0.75 * tax;
		} else if (professionals > 1) {
			councilTax = tax;
		}
		this.councilTax = councilTax;
	}
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(this.houseNumber);
		output.append(" ");
		output.append(this.street);
		output.append(", ");
		output.append(this.city);
		output.append(" ");
		output.append(this.postCode);
		output.append(" (");
		output.append(this.numberOfRooms);
		output.append(" bedroom house :");
		output.append(this.getAvailableRooms());
		output.append(" available)");
		return output.toString();
	}
	private boolean validateCity(String input) {
		String regex = "[A-Z]{1}[a-z]*";
		boolean valid = false;
		if (input.matches(regex)) {
			valid = true;
		}
		return valid;
	}
	private boolean validatePostCode(String input) {
		String regex = "(GU)[0-9]{1}( ){0,1}[0-9]{1}[A-Z]{2}";
		boolean valid = false;
		if (input.matches(regex)) {
			valid = true;
		}
		return valid;
	}
	public abstract double getPrice();
	public abstract boolean isAvailable();
	public abstract void occupy(Room r, ITenant t);
	public abstract String displayOccupiedProperty();
}
