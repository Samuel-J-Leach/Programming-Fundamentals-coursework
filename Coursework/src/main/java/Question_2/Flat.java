package Question_2;

import java.util.Map;

public class Flat extends Property {
	private static final double MAINTENANCE_COSTS = 500.0;
	private int floor = 0;
	public Flat(int h, String s, String c, String p, int n, int f) {
		super(h, s, c, p, n);
		if (f > 0) {
			this.floor = f;
		} else {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public double getPrice() {
		double price = 0.0;
		for (Map.Entry<Room, ITenant> room : this.rooms.entrySet()) {
			price += room.getKey().getPrice() * 12;
		}
		return price + Flat.MAINTENANCE_COSTS;
	}
	@Override
	public boolean isAvailable() {
		boolean available = true;
		if (this.rooms.size() > 0) {
			available = false;
		}
		return available;
	}
	@Override
	public void occupy(Room r, ITenant t) {
		if (this.isAvailable()
				&& t.getType() == TenantType.PROFESSIONAL) {
			this.rooms.put(r, t);
		} else {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public String displayOccupiedProperty() {
		StringBuffer output = new StringBuffer();
		output.append(this.toString());
		if (!this.isAvailable()) {
			for (Map.Entry<Room, ITenant> room
					: this.rooms.entrySet()) {
				output.append("\n\tRoom: ");
				output.append(room.getKey().getPrice());
			}
			if (this.rooms.size() > 0) {
				output.append("\n	Total: £");
				output.append(String
					.format("%.02f", this.getPrice()));
				output.append(" (Council Tax: £");
				output.append(this.councilTax);
				output.append(")");
			}
		}
		return output.toString();
	}
	@Override
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(this.getHouseNumber());
		output.append(" ");
		output.append(this.getStreet());
		output.append(", ");
		output.append(this.getCity());
		output.append(" ");
		output.append(this.getPostCode());
		output.append(" (");
		output.append(this.getNumberOfRooms());
		output.append(" bedroom flat on ");
		output.append(this.floor);
		output.append(" floor :");
		output.append(this.getAvailableRooms());
		output.append(" available)");
		return output.toString();
	}
}
