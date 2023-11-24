package ProblemSet_7c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;
	public Student(String name, String urn)
			throws IllegalArgumentException {
		if (name.matches("[A-Z]{1}[a-z]*( )[A-Z]{1}[a-z]*")) {
			this.name = name;
		} else {
			throw new IllegalArgumentException();
		}
		if (urn.matches("[0-9]{5}")) {
			this.urn = urn;
		} else {
			this.urn = "00000";
		}
		this.moduleList = new ArrayList<Module>();
	}
	public String getName() {
		return this.name;
	}
	public int getUrn() {
		return Integer.parseInt(this.urn);
	}
	public void addModuleList(Module m) {
		boolean valid = true;
		if (m == null) {
			valid = false;
		} else {
			for (Module module : this.moduleList) {
				if (m == module) {
					valid = false;
				}
			}
		}
		if (valid) {
			this.moduleList.add(m);
		}
	}
	public String printModules() {
		StringBuffer modules = new StringBuffer();
		for (Module module : this.moduleList) {
			modules.append(", ");
			modules.append(module.getName());
		}
		return modules.toString().substring(2);
	}
}
