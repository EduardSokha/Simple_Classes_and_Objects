package OOP.task_number_6;

public class Seconds {
	private int seconds;
	public Seconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void SetSeconds(int seconds) {
		this.seconds = seconds;
		if(seconds>60) {
			this.seconds=0;
		}
		System.out.println(" ss="+this.seconds);
	}

}
