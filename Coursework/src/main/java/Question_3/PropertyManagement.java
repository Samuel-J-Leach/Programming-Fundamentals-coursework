package Question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropertyManagement {
	/**the property list.*/
	private List<Property> properties = null;
	/**default constructor that sets the
	 * properties list as a new array list.*/
	public PropertyManagement() {
		this.properties = new ArrayList<Property>();
	}
	public String displayInfographics() {
		int age = 0;
		TenantType type = null;
		int[] ageBrackets = new int[] {0, 0, 0, 0, 0};
		int professionals = 0;
		int students = 0;
		for (Property p : this.properties) {
			for (Map.Entry<Room, ITenant> r : p.rooms.entrySet()) {
				age = r.getValue().getAge();
				if (age >= 17 && age <= 25) {
					ageBrackets[0] += 1;
				} else if (age >= 26 && age <= 35) {
					ageBrackets[1] += 1;
				} else if (age >= 36 && age <= 49) {
					ageBrackets[2] += 1;
				} else if (age >= 50 && age <= 60) {
					ageBrackets[3] += 1;
				} else if (age > 60) {
					ageBrackets[4] += 1;
				}
				type = r.getValue().getType();
				if (type == TenantType.PROFESSIONAL) {
					professionals++;
				} else if (type == TenantType.STUDENT) {
					students++;
				}
			}
		}
		StringBuffer info = new StringBuffer();
		info.append("Confirmed Tenant Summary:\n17-25:");
		info.append(ageBrackets[0]);
		info.append("\n26-35:");
		info.append(ageBrackets[1]);
		info.append("\n36-49:");
		info.append(ageBrackets[2]);
		info.append("\n50-60:");
		info.append(ageBrackets[3]);
		info.append("\n60+:");
		info.append(ageBrackets[4]);
		info.append("\n*****\nProfessional:");
		info.append(professionals);
		info.append("\nStudent:");
		info.append(students);
		return info.toString();
	}
	public String findProblematicProperty() {
		Property problematic = null;
		for (Property p : this.properties) {
			if (problematic == null
					|| p.calculateImpact()
					> problematic.calculateImpact()) {
				problematic = p;
			}
		}
		return problematic.toString();
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
			if (type.equals(property
				.getClass().getSimpleName().toLowerCase())) {
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
