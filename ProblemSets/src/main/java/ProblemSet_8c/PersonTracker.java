package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {
	private List<Person> peopleList;
	public PersonTracker() {
		this.peopleList = new ArrayList<Person>();
	}
	public String readTextFile(String file) throws NullPointerException {
		if (file == null) {
			throw new NullPointerException();
		}
		int counter = 0;
		String[] values = new String[3];
		StringBuffer text = new StringBuffer();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bFileReader = new
					BufferedReader(fileReader);
			String line = "";
			while (line != null) {
				line = bFileReader.readLine();
				if (line != null) {
					counter++;
					values = breakLine(line);
					this.addPerson(values[0], values[1],
						Integer.parseInt(values[2]));
					text.append(line);
					text.append(" : ");
					text.append(counter);
					text.append("\n");
				}
			}
			bFileReader.close();
			fileReader.close();
		} catch (IOException e) {
			text.replace(0, text.length(), "");
		}
		return text.toString();
	}
	public void addPerson(String n, String s, int a) {
		this.peopleList.add(new Person(n, s, a));
	}
	public String displayList() {
		StringBuffer list = new StringBuffer();
		for (Person person : this.peopleList) {
			list.append(person.toString());
			list.append("\n");
		}
		return list.toString();
	}
	private String[] breakLine(String line) {
		String[] values = line.split(" ");
		return values;
	}
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
