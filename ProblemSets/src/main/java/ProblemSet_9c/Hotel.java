package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String name;
	private List<IGuest> guests;
	public Hotel(String name) {
		this.name = name;
		this.guests = new ArrayList<IGuest>();
	}
	public String getName() {
		return this.name;
	}
	public List<IGuest> getGuests() {
		return this.guests;
	}
	public void addGuest(IGuest guest) {
		this.guests.add(guest);
	}
	public String printGuestList() {
		StringBuffer guestList = new StringBuffer();
		guestList.append(this.name);
		guestList.append(" Hotel\nGuest List\n");
		for (IGuest guest : this.guests) {
			guestList.append(guest.toString());
			guestList.append("\n");
		}
		return guestList.toString();
	}
}
