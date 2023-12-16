package Question_3;

public class Complaint {
	private String title = null;
	private Severity severity = null;
	public Complaint(String t, Severity s) {
		super();
		if (t == null || s == null) {
			throw new NullPointerException();
		}
		this.title = t;
		this.severity = s;
	}
	public String getTitle() {
		return this.title;
	}
	public Severity getSeverity() {
		return this.severity;
	}
}
