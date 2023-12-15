package Question_1;

import java.util.HashMap;
import java.util.Map;

public class House {
	private int houseNumber = 0;
	private String street = null;
	private String city = null;
	private String postCode = null;
	private int numberOfRooms = 0;
	private Map<Room, ITenant> rooms = null;
	public House(int h, String s, String c, String p, int n) {
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
		}
	}
	public int getAvailableRooms() {
		return this.numberOfRooms - this.rooms.size();
	}
	public double getPrice() {
		double price = 0.0;
		for (Map.Entry<Room, ITenant> room : this.rooms.entrySet()) {
			price += room.getKey().getPrice();
		}
		return price;
	}
	public boolean isAvailable() {
		boolean available = true;
		if (this.getAvailableRooms() == 0) {
			available = false;
		}
		return available;
	}
	public void occupy(Room r, ITenant t) {
		if (this.isAvailable()) {
			this.rooms.put(r, t);
		} else {
			throw new IllegalArgumentException();
		}
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
}
