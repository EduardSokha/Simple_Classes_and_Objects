package OOP.task_number_5;

public class Reduce {
	
	private int x;
//	private int maxValue = x+2;
	private int minValue = x-2;
	private String z;
	
	public Reduce (int x) {
		this.x = x;		
	}
	
	public String reduce() {
//		this.maxValue = x;
		x--;
		if (x <= minValue) {
			String z = "enought";
			System.out.println("xreduce=" + x);
			System.out.println(z);
			return z;
		}
		System.out.println("xreduce=" + x);
		return z;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	

}
