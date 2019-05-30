package OOP.task_number_3;

public class StudentLogic {
	
	public boolean isLevelStudent(Student student) {
		
		int[] marks = student.getMarks();
		
		for(int i=0; i<marks.length; i++) {
			if(marks[i] !=5) {
				return false;
			}
			
		}
		return true;
	}
	

}
