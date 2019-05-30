package java_classes_and_objects.task8;
import java.util.List;

public class SortingData {
	
	private List <Customer> data;
	private int t=5;
	private String [] nam = new String [t];
	private Customer [] obj = new Customer [t];
	private String [] nams = new String [t];
	private int i;
	private int n = 0;
	private int results;
	
//	public SortingData() {
//		
//	}
	
	public void G (Data d) {
		
		data= d.getData();
		
		for(Customer dt : data) {
			String a;
			a = dt.getName();
			nam [i] = a;			
			obj [i] = dt;
			i++;
//			System.out.println(dt);
//			System.out.println(dt.getName());
//			System.out.println(nam [i]);
//			System.out.println(obj [i]);
		}
		
		
		for(int j=0; j<nam.length; j++) {
			System.out.println(nam[j]);
		}
		
		System.out.println("--------------------");
		
		for(int j=0; j<nam.length-1; j++) {
			
			int h = 0;
			if(h>15) {
				break;
			}
			if(nam[j+1]==null) {
				continue;
			}
			String a = nam [n];
			String b = nam [j+1];
			results = a.compareTo(b);
			
			if (results>0) {
				n=j;
//				h++;
//				j=0;				
			}
			
			
			if (j==nam.length-2) {
				nam[n] = null;
//				j=0;
				n=0;
//				h++;
			}
			System.out.println("hhh  "+nam [n]);
			h++;
		}
		
		for(int j=0; j<nam.length; j++) {
			System.out.println(nam[j]);
		}
		
		
	}
		
}
	
	
	


