package OOP.task_number_3;

public class Main {
	public static void main(String[]args) {
		Student st1 = new Student("Vasya", 20, new int[] {5, 5, 3, 2, 4});
		Student st2 = new Student("Vasya1", 23, new int[] {2, 2, 3, 2, 4});
		Student st3 = new Student("Vasya2", 25, new int[] {5, 5, 5, 5, 5});
		Student st4 = new Student("Vasya3", 28, new int[] {1, 5, 3, 2, 4});
		Student st5 = new Student("Vasya4", 40, new int[] {5, 5, 2, 5, 5});
			
		
		StudentLogic stLogic = new StudentLogic();
		//System.out.println(stLogic.isLevelStudent(st1));
		
		GroupLogic grLogic = new GroupLogic(stLogic);
		
		Group gr1 = new Group(10);
		gr1.add(st1);
		gr1.add(st2);
		gr1.add(st3);
		gr1.add(st4);
		gr1.add(st5);
		
		System.out.println(grLogic.countOfALevelStudents(gr1));
	}

}
