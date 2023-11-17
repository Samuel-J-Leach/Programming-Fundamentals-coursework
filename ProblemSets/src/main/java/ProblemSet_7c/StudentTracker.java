package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	private List<Student> studentList;
	private Map<Integer, Student> moduleList;
	public StudentTracker() {
		super();
		this.studentList = new ArrayList<Student>();
		this.moduleList = new HashMap<Integer, Student>();
	}
	public void addStudent(Student s, List<Module> mList) {
		for (Module module : mList) {
			s.addModuleList(module);
		}
		this.studentList.add(s);
		this.initialiseMap();
	}
	private void initialiseMap() {
		for (Student student : this.studentList) {
			moduleList.put(student.getUrn(), student);
		}
	}
	public String printStudents() {
		StringBuffer students = new StringBuffer();
		for (Student student : this.studentList) {
			students.append(student.getName());
			students.append("(");
			students.append(student.getUrn());
			students.append(")\n");
		}
		return students.toString();
	}
	public String printModules(int urn) {
		StringBuffer modules = new StringBuffer();
		modules.append("URN ");
		modules.append(urn);
		modules.append(" is enrolled in:\n");
		modules.append(moduleList.get(urn).printModules());
		return modules.toString();
	}
}
