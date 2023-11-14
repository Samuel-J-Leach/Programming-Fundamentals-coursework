package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours = null;
	public Palette(P_COLOUR[] primaryColours) {
		this.primaryColours = primaryColours;
	}
	public Palette() {
		super();
		this.primaryColours = new P_COLOUR[3];
	}
	public void addColour(P_COLOUR colour) throws IllegalArgumentException {
		int length = this.primaryColours.length;
		for (int i = 0; i < length; i++) {
			if (this.primaryColours[i] == null) {
				this.primaryColours[i] = colour;
				colour = null;
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
