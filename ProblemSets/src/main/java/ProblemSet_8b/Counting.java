package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {
	public Counting() {
		super();
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
					text.append(displayLine(line, counter));
				}
			}
			bFileReader.close();
			fileReader.close();
		} catch(IOException e) {
			text.replace(0, text.length(), "");
		}
		return text.toString();
	}
	public String displayLine(String line, int counter) {
		return line + " : " + counter + "\n";
	}
}
