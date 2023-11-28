package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

/*Hotel class stores the hotel name
 * and list of guests*/
public class Hotel {
	private String name;
	private List<IGuest> guests;
	/*parameterized constructor
	 * with no validation*/
	public Hotel(String name) {
		this.name = name;
		//default value
		this.guests = new ArrayList<IGuest>();
	}
	/*returns the name attribute*/
	public String getName() {
		return this.name;
	}
	/*returns the guests attribute*/
	public List<IGuest> getGuests() {
		return this.guests;
	}
	/*inserts a given Guest object into
	 * the end of guests*/
	public void addGuest(IGuest guest) {
		this.guests.add(guest);
	}
	/*returns a string containing all the guests
	 * staying at the hotel with all their details.
	 * format: "
	 * name of hotel
	 * Guest List
	 * forename surname, address, phone number
	 * forename surname, address, phone number
	 * forename surname, address, phone number
	 * ..."*/
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
