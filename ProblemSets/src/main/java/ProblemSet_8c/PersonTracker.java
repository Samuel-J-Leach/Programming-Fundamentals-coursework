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
		StringBuffer text = new StringBuffer();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bFileReader = new BufferedReader(fileReader);
			String line = "";
			while (line != null) {
				line = bFileReader.readLine();
				if (line != null) {
					counter ++;
					//format line info
				}
			}
			bFileReader.close();
			fileReader.close();
		} catch(IOException e) {
			text.replace(0, text.length(), "");
		}
		return text.toString();
	}
	public void addPerson(String n, String s, int a) {}
	public String displayList() {}
	private void breakLine(String line) {}
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
