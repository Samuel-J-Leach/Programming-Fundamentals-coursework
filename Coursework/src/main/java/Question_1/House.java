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
		String postCodeRegex = "(GU)[0-9]{1}( ){0,1}[0-9]{1}[A-Z]{2}";
		String cityRegex = "[A-Z]{1}[a-z]*";
		if (h == 0 || s == null || c == null || p == null || n == 0) {
			throw new NullPointerException();
		} else if (!p.matches(postCodeRegex) || !c.matches(cityRegex)) {
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
		return this.numberOfRooms;
	}
	public double getPrice() {
		double price = 0.0;
		for (Map.Entry<Room, ITenant> room : this.rooms.entrySet()) {
			price += room.getKey().getPrice();
		}
		return price;
	}
}
