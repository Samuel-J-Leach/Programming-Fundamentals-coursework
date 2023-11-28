package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Counting class allows the user to read files*/
public class Counting {
	public Counting() {
		super();
	}
	/*file parameter is used to open a file and each
	 * line is formatted and returned as one input, if the
	 * given filename is empty an exception is raised*/
	public String readTextFile(String file) throws NullPointerException {
		if (file == null) {
			throw new NullPointerException();
		}
		int counter = 0;
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
					text.append(displayLine(line, counter));
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
	/*output is in the form: "line : counter\n"*/
	public String displayLine(String line, int counter) {
		return line + " : " + counter + "\n";
	}
}
