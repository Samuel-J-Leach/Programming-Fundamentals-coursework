package Question_1;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	/**the property list.*/
	private List<House> properties = null;
	/**default constructor that sets the
	 * properties list as a new array list.*/
	public PropertyManagement() {
		this.properties = new ArrayList<House>();
	}
	/**adds a new house object to
	 * the properties list.
	 * @param p
	 * */
	public void addProperty(House p) {
		this.properties.add(p);
	}
	/**adds a new tenant to an available room.
	 * @param p
	 * @param r
	 * @param t
	 * */
	public void addTenant(House p, Room r, ITenant t) {
		/*shows whether p is actually
		 * in the property list*/
		boolean validHouse = false;
		/*iterates through every property*/
		for (House house : this.properties) {
			if (house == p) {
				/*p is in the property list*/
				validHouse = true;
				/*tenant is added to the
				 * house with their room*/
				try {
					house.occupy(r, t);
				} catch (IllegalArgumentException e) {
					/*house is not available*/
					throw e;
				}
				break;
			}
		}
		if (!validHouse) {
			/*p was not in the property list*/
			throw new IllegalArgumentException();
		}
	}
	/**returns the toString value of every
	 * house in the property list.
	 * @return output.toString()
	 * */
	public String displayProperties() {
		StringBuffer output = new StringBuffer();
		/*iterates through every property*/
		for (House house : this.properties) {
			/*adds toString() value to output*/
			output.append(house.toString());
			output.append("\n");
		}
		return output.toString();
	}
	/**removes a house from the property list.
	 * @param p
	 * */
	public void removeProperty(House p) {
		/*shows whether p is actually
		 * in the property list*/
		boolean validHouse = false;
		/*iterates through every property*/
		for (House house : this.properties) {
			if (house == p) {
				/*p is in the property list*/
				validHouse = true;
				/*p is removed from the property list*/
				this.properties.remove(house);
				break;
			}
		}
		if (!validHouse) {
			/*p was not in the property list*/
			throw new IllegalArgumentException();
		}
	}
}
