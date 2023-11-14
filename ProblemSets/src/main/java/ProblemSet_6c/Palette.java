package ProblemSet_6c;

import java.util.Arrays;

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
	public String mixColours() {
		String newColour = "";
		int length = (int) Arrays
				.stream(this.primaryColours)
				.filter(e -> e != null)
				.count();
		P_COLOUR[] colours = new P_COLOUR[length];
		for (int i = 0; i < length; i++) {
			colours[i] = this.primaryColours[i];
		}
		P_COLOUR[] rb = new P_COLOUR[]
				{P_COLOUR.RED, P_COLOUR.BLUE};
		P_COLOUR[] br = new P_COLOUR[]
				{P_COLOUR.BLUE, P_COLOUR.RED};
		P_COLOUR[] ry = new P_COLOUR[]
				{P_COLOUR.RED, P_COLOUR.YELLOW};
		P_COLOUR[] yr = new P_COLOUR[]
				{P_COLOUR.YELLOW, P_COLOUR.RED};
		P_COLOUR[] by = new P_COLOUR[]
				{P_COLOUR.BLUE, P_COLOUR.YELLOW};
		P_COLOUR[] yb = new P_COLOUR[]
				{P_COLOUR.YELLOW, P_COLOUR.BLUE};
		if (colours.length == 1) {
			newColour = colours[0].toString();
		} else if (Arrays.equals(colours, rb)
				|| Arrays.equals(colours, br)) {
			newColour = "PURPLE";
		} else if (Arrays.equals(colours, ry)
				|| Arrays.equals(colours, yr)) {
			newColour = "ORANGE";
		} else if (Arrays.equals(colours, by)
				|| Arrays.equals(colours, yb)) {
			newColour = "GREEN";
		} else if (colours.length == 3) {
			newColour = "BLACK";
		}
		return newColour;
	}
	public String display() {
		StringBuffer colours = new StringBuffer();
		int size = this.primaryColours.length;
		for (int i = 0; i < size; i++) {
			if (this.primaryColours[i] != null) {
				colours.append(this.primaryColours[i].toString());
				if (this.primaryColours[i+1] != null) {
					colours.append(", ");
				}
			}
		}
		colours.append(" = ");
		colours.append(this.mixColours());
		return colours.toString();
	}
}
