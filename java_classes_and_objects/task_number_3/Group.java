package OOP.task_number_3;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> students;
	private int groupSize;
	
	public Group(int groupSize) {
		this.groupSize = groupSize;
		students = new ArrayList<Student>(groupSize);
	} 
	
	public boolean add(Student st) {
		if (groupSize <= students.size() ) {
			return false;
		}
		students.add(st);
		return true;
	}
	
	public void remove(Student st) {
		students.remove(st);
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getGroupSize() {
		return groupSize;
	}
	
	

}
