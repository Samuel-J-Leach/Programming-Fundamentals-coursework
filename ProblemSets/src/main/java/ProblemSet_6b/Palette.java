package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours = null;
	public Palette(P_COLOUR[] primaryColours) throws IllegalArgumentException {
		if (primaryColours.length > 3) {
			throw new IllegalArgumentException();
		}
		this.primaryColours = new P_COLOUR[3];
		for (int i = 0; i < primaryColours.length; i++) {
			this.primaryColours[i] = primaryColours[i];
		}
	}
	public Palette() {
		super();
		this.primaryColours = new P_COLOUR[3];
	}
	public void addColour(P_COLOUR colour) throws IllegalArgumentException {
		for (int i = 0; i < 3; i++) {
			if (this.primaryColours[i] == null) {
				this.primaryColours[i] = colour;
				colour = null;
			} else if (this.primaryColours[i] == colour) {
				throw new IllegalArgumentException();
			}
		}
		if (colour != null) {
			throw new IllegalArgumentException();
		}
	}
	public String getColours() {
		String colours = "";
		for (P_COLOUR colour : this.primaryColours) {
			if (colour != null) {
				colours = colours + ", " + colour.toString();
			}
		}
		if (colours == "") {
			colours = "No colours added";
		} else {
			colours = colours.substring(2);
		}
		return colours;
	}
}
