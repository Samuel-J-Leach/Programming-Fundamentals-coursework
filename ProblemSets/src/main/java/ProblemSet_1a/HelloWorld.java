//HelloWorld.java

package ProblemSet_1a;

/*
 * a simple class that returns a "hello world" message
 * @author Samuel Leach
 */

public class HelloWorld {
	private String message = "";
	public HelloWorld(String msg) {
		message = msg;
	}
	public String display() {
		return message;
	}
}
