package java_classes_and_objects.task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers num = new Numbers(5, 8);
		
		Logic lg = new Logic(num.getX(), num.getY());
		
		lg.show();
		lg.sum();
		lg.comparison();
		
		
	}

}
