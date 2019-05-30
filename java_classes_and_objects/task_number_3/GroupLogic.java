package OOP.task_number_3;

import java.util.List;

public class GroupLogic {
	private StudentLogic studentLogic;
	public GroupLogic(StudentLogic studentLogic) {
		this.studentLogic = studentLogic;
		
	}
	
	public int countOfALevelStudents(Group group) {
		int countALevelStudents = 0;
		List<Student> students;
		
		students = group.getStudents();
		
		for(Student st : students) {
			if(studentLogic.isLevelStudent(st)) {
				countALevelStudents++;
			}
			
		}
		
		
		return countALevelStudents;
		
	}


}
