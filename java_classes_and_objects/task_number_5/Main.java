package OOP.task_number_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random value = new Random();
		value.getX();
		
		 Increase incr = new  Increase(value.getX());
		 incr.increase();
		 
		 Reduce reduce = new Reduce(value.getX());
		 reduce.reduce();
	}

}
