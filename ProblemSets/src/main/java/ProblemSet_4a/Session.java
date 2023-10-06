package ProblemSet_4a;

public class Session {
	private String sessionName;
	private int startTime;
	private int endTime;
	public Session(String sn, int st, int et) {
		sessionName = sn;
		startTime = st;
		endTime = et;
	}
	public String getSessionName() {
		return sessionName;
	}
	public int getStartTime() {
		return startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setStartTime(int newst) {
		startTime = newst;
	}
	public void setEndTime(int newet) {
		endTime = newet;
	}
}
