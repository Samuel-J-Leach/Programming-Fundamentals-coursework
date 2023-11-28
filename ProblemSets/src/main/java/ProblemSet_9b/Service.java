package ProblemSet_9b;

/*Service class stores the code, name and VAT
 * rate of a service that can be bought*/
public class Service {
	private String code;
	private String name;
	private VATRate rate;
	/*parameterized constructor, raises an
	 * exception if name or code are null or
	 * if code is not 4 capital letters followed
	 * by a 5 digit number*/
	public Service(String code, String name, VATRate rate)
			throws IllegalArgumentException, NullPointerException {
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
	/*returns the code attribute*/
	public String getCode() {
		return this.code;
	}
	/*returns the name attribute*/
	public String getName() {
		return this.name;
	}
	/*returns the VATRate attribute*/
	public VATRate getRate() {
		return this.rate;
	}
}
