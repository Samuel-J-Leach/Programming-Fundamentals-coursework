package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double[] rainfallMonths = new double[12];
	public RainfallYear(int y) {
		year = y;
	}
	public int getYear() {
		return year;
	}
	public double calculateMeanRainfall() {
		double totalRainfall = 0;
		for (double rainfall : rainfallMonths) {
			totalRainfall += rainfall;
		}
		return totalRainfall / 12.0;
	}
	public double calculateHighestRainfall() {
		double highest = 0;
		for (double rainfall : rainfallMonths) {
			if (rainfall > highest) {
				highest = rainfall;
			}
		}
		return highest;
	}
	public void enterData(double[] data) {
		rainfallMonths = data;
	}
	public double getRainfallMonth(String month) {
		double rainfall = 0.0;
		switch (month) {
		case "JANUARY":
			rainfall = rainfallMonths[0];
			break;
		case "FEBRUARY":
			rainfall = rainfallMonths[1];
			break;
		case "MARCH":
			rainfall = rainfallMonths[2];
			break;
		case "APRIL":
			rainfall = rainfallMonths[3];
			break;
		case "MAY":
			rainfall = rainfallMonths[4];
			break;
		case "JUNE":
			rainfall = rainfallMonths[5];
			break;
		case "JULY":
			rainfall = rainfallMonths[6];
			break;
		case "AUGUST":
			rainfall = rainfallMonths[7];
			break;
		case "SEPTEMBER":
			rainfall = rainfallMonths[8];
			break;
		case "OCTOBER":
			rainfall = rainfallMonths[9];
			break;
		case "NOVEMBER":
			rainfall = rainfallMonths[10];
			break;
		case "DECEMBER":
			rainfall = rainfallMonths[11];
			break;
		}
		return rainfall;
	}
}
