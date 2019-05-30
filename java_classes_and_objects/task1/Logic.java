package java_classes_and_objects.task1;

public class Logic {
	private int x;
	private int y;
	
	public Logic (int x, int y) {
	this.x=x+5;
	this.y=y+6;
//	int[] mas= new int[2];
//	mas[0]=a;
//	mas[1]=b;
//	return mas;
//	show(x, y);
	}
	
	public void show () {
//		int a=x;
//		int b=y;
		System.out.println("x= " + x +"y= "+ y);
//		sum(x,y);
//		fdf(x,y);
	}
	
	public void sum () {
		int z=x+y;
		System.out.println("sum="+z);
	}
	
	public void comparison () {
		if(x>y) {
			System.out.println("x>y");
		}else {
			System.out.println("x<y");
		}
		
	}
}
