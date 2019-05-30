package OOP.task_number_6;

public class Hours {
	private int hours;
	public Hours(int hours) {
		this.hours = hours;
	}
	
	public void SetHours(int hours) {
		this.hours = hours;
		if(hours>24) {
			this.hours=0;
		}
		System.out.print(" hh="+this.hours);
	}

}
