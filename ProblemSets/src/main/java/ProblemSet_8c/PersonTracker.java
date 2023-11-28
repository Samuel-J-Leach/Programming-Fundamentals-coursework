package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*PersonTracker class stores a list of Person objects*/
public class PersonTracker {
	private List<Person> peopleList;
	/*default constructor*/
	public PersonTracker() {
		this.peopleList = new ArrayList<Person>();
	}
	/*file parameter is used to open a file and each
	 * line is formatted and returned as one input, if the
	 * given filename is empty an exception is raised*/
	public String readTextFile(String file) throws NullPointerException {
		if (file == null) {
			throw new NullPointerException();
		}
		int counter = 0;
		String[] values = new String[3];
		StringBuffer text = new StringBuffer();
		/*file is opened, if an IOException occurs then an
		 * empty string is returned*/
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bFileReader = new
					BufferedReader(fileReader);
			String line = "";
			/*each line in the file is formatted with its
			 * line number and count is incremented*/
			while (line != null) {
				line = bFileReader.readLine();
				if (line != null) {
					counter++;
					values = this.breakLine(line);
					/*adds a new person to peopleList*/
					this.addPerson(values[0], values[1],
						Integer.parseInt(values[2]));
					/*formats line as: "line : counter\n"*/
					text.append(line);
					text.append(" : ");
					text.append(counter);
					text.append("\n");
				}
			}
			bFileReader.close();
			fileReader.close();
		} catch (IOException e) {
			/*empties the string holding all previous lines*/
			text.replace(0, text.length(), "");
		}
		return text.toString();
	}
	/*creates new Person object with the parameters and
	 * inserts it into the end of peopleList*/
	public void addPerson(String n, String s, int a) {
		this.peopleList.add(new Person(n, s, a));
	}
	/*outputs the string representation of
	 * every Person object stored in peopleList*/
	public String displayList() {
		StringBuffer list = new StringBuffer();
		for (Person person : this.peopleList) {
			list.append(person.toString());
			list.append("\n");
		}
		return list.toString();
	}
	/*splits input using spaces*/
	private String[] breakLine(String line) {
		String[] values = line.split(" ");
		return values;
	}
	/*returns a list of people*/
	public String getPeopleList() {
		StringBuffer list = new StringBuffer();
		list.append("[");
		for (Person person : this.peopleList) {
			list.append(person.toString());
		}
		list.append("]");
		return list.toString();
	}
}
