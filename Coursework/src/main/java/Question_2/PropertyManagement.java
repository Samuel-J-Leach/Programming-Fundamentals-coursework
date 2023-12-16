package Question_2;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	/**the property list.*/
	private List<Property> properties = null;
	/**default constructor that sets the
	 * properties list as a new array list.*/
	public PropertyManagement() {
		this.properties = new ArrayList<Property>();
	}
	/**adds a new Property object to
	 * the properties list.
	 * @param p
	 * */
	public void addProperty(Property p) {
		this.properties.add(p);
	}
	/**adds a new tenant to an available room.
	 * @param p
	 * @param r
	 * @param t
	 * */
	public void addTenant(Property p, Room r, ITenant t) {
		/*shows whether p is actually
		 * in the property list*/
		boolean validProperty = false;
		/*iterates through every property*/
		for (Property property : this.properties) {
			if (property == p) {
				/*p is in the property list*/
				validProperty = true;
				/*tenant is added to the
				 * property with their room*/
				try {
					property.occupy(r, t);
				} catch (IllegalArgumentException e) {
					/*property is not available*/
					throw e;
				}
				break;
			}
		}
		if (!validProperty) {
			/*p was not in the property list*/
			throw new IllegalArgumentException();
		}
	}
	/**returns the toString value of every
	 * property in the property list.
	 * @return output.toString()
	 * */
	public String displayProperties() {
		StringBuffer output = new StringBuffer();
		/*iterates through every property*/
		for (Property property : this.properties) {
			/*adds toString() value to output*/
			output.append(property.displayOccupiedProperty());
			output.append("\n");
		}
		return output.toString();
	}
	/**removes a property from the property list.
	 * @param p
	 * */
	public void removeProperty(Property p) {
		/*shows whether p is actually
		 * in the property list*/
		boolean validProperty = false;
		/*iterates through every property*/
		for (Property property : this.properties) {
			if (property == p) {
				/*p is in the property list*/
				validProperty = true;
				/*p is removed from the property list*/
				this.properties.remove(property);
				break;
			}
		}
		if (!validProperty) {
			/*p was not in the property list*/
			throw new IllegalArgumentException();
		}
	}
	public int numberOfPropertyType(String type) {
		int count = 0;
		for (Property property : this.properties) {
			if (type.equals(property.getClass().getSimpleName().toLowerCase())) {
				count++;
			}
		}
		return count;
	}
	public double percentageCouncilTaxExemption() {
		double exempt = 0.0;
		for (Property property : this.properties) {
			if (property.getCouncilTax() == 0.0) {
				exempt += 1.0;
			}
		}
		exempt = (exempt / this.properties.size()) * 100.0;
		return exempt;
	}
}
