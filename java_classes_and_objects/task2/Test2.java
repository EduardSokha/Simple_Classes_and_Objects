package java_classes_and_objects.task2;

public class Test2 {
	private int x;
	private int y;
	
	public Test2(int a, int b) {
		this(a, b, " ����������aa ");
		
	}
	public Test2(int x, int y, String z) {
		this.x = x;
		this.y = y;
		System.out.println(x +z+ y );		
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2 other = (Test2) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Numbers [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
