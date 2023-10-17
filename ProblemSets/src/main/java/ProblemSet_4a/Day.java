package ProblemSet_4a;

public class Day {
	private String name;
	private Session [] sessions = new Session[3];
	public Day(String pName) {
		name = pName;
	}
	public String getName() {
		return name;
	}
	public void setSession(int index, String moduleName,
			int startTime, int endTime) {
		sessions[index] = new Session(moduleName, startTime, endTime);
	}
	public Session getSessions(int index) {
		return sessions[index];
	}
	public String toString() {
		String msg = "";
		Session session;
		for (int i = 0; i < sessions.length; i++) {
			session = sessions[i];
			if (session != null) {
				msg += session.getSessionName() + ": "
						+ session.getStartTime() + " - "
						+ session.getEndTime() + "\n";
			}
		}
		return msg;
	}
	public void display() {
		System.out.println(name);
		System.out.println(toString());
	}
}
