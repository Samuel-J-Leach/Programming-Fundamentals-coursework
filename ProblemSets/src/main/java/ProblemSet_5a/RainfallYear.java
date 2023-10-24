package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double[] rainfallMonths = new double[12];
	public RainfallYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public double calculateMeanRainfall() {
		double totalRainfall = 0;
		for (double rainfall : this.rainfallMonths) {
			totalRainfall += rainfall;
		}
		return totalRainfall / 12.0;
	}
	public double calculateHighestRainfall() {
		double highest = 0;
		for (double rainfall : this.rainfallMonths) {
			if (rainfall > highest) {
				highest = rainfall;
			}
		}
		return highest;
	}
	public void enterData(double[] data) {
		this.rainfallMonths = data;
	}
	public double getRainfallMonth(String month) {
		double rainfall = 0.0;
		switch (month) {
		case "JANUARY":
			rainfall = this.rainfallMonths[0];
			break;
		case "FEBRUARY":
			rainfall = this.rainfallMonths[1];
			break;
		case "MARCH":
			rainfall = this.rainfallMonths[2];
			break;
		case "APRIL":
			rainfall = this.rainfallMonths[3];
			break;
		case "MAY":
			rainfall = this.rainfallMonths[4];
			break;
		case "JUNE":
			rainfall = this.rainfallMonths[5];
			break;
		case "JULY":
			rainfall = this.rainfallMonths[6];
			break;
		case "AUGUST":
			rainfall = this.rainfallMonths[7];
			break;
		case "SEPTEMBER":
			rainfall = this.rainfallMonths[8];
			break;
		case "OCTOBER":
			rainfall = this.rainfallMonths[9];
			break;
		case "NOVEMBER":
			rainfall = this.rainfallMonths[10];
			break;
		case "DECEMBER":
			rainfall = this.rainfallMonths[11];
			break;
		default:
			rainfall = 0.0;
		}
		return rainfall;
	}
}
