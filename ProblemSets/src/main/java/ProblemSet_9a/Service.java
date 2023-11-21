package ProblemSet_9a;

public class Service {
	private String code;
	private String name;
	private VATRate rate;
	public Service(String code, String name, VATRate rate) throws IllegalArgumentException, NullPointerException {
		String regex = "[A-Z]{4}[0-9]{5}";
		if (code == null || name == null) {
			throw new NullPointerException();
		} else if (code.matches(regex)) {
			this.code = code;
			this.name = name;
		} else {
			throw new IllegalArgumentException();
		}
		this.rate = rate;
	}
	public String getCode() {
		return this.code;
	}
	public String getName() {
		return this.name;
	}
	public VATRate getRate() {
		return this.rate;
	}
}
