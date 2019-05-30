package OOP.task_number_6;

public class Minute {
	
	private int minute;
	public Minute(int minute) {
		this.minute = minute;
	}
	
	public void SetMinute(int minute) {
		this.minute = minute;
		if(minute>60) {
			this.minute=0;
		}
		System.out.print(" mm="+this.minute);
	}

}
