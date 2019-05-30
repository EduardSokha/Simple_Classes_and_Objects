package OOP.task_number_5;

public class Random {
	private int x = (int) (Math.random()*100);

	public int getX() {
		System.out.println("xrandom=" + x);
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	

}
