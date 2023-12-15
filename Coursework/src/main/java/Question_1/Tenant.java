package Question_1;

public class Tenant implements ITenant {
	private String forename;
	private String surname;
	private int age;
	private TenantType type;
	public Tenant(String f, String s, int a, TenantType t) {
		if (f == null || s == null || a == 0 || t == null) {
			throw new NullPointerException();
		}
		String regex = "[A-Z]{1}[a-z]*";
		if (f.matches(regex) && s.matches(regex) && a > 16) {
			this.forename = f;
			this.surname = s;
			this.age = a;
			this.type = t;
		} else {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public int getAge() {
		return this.age;
	}
	@Override
	public String getName() {
		return this.forename + " " + this.surname;
	}
	@Override
	public TenantType getType() {
		return this.type;
	}

}
