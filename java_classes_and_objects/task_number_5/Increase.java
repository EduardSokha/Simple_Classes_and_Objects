package OOP.task_number_5;

public class Increase {
	
	private int x;
//	private int maxValue = x+2;
//	private int minValue = x-2;
	private int counter = 0;
	private String z;
	
	public Increase(int x) {
		this.x = x;		
	}
	
	public String increase() {
//		this.maxValue = x;
		x++;
		counter++;
		if (counter>=2) {
			String z = "enought";
			System.out.println("x=" + x);
			System.out.println(z);
			return z;
		}
		System.out.println("x=" + x);
		return z;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	
}
