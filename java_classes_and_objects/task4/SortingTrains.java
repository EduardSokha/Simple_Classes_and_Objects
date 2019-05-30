package java_classes_and_objects.task4;
import java.util.List;

public class SortingTrains {
	private List <Train> trains;	
	private int[] mas = new int[6];
	private int i=0;
	
	
	
	public void Sorting(ListTrains lit) {
		trains = lit.getTrains();
		
		for(Train tr:trains) {			
			mas[i]=tr.getNumberTrain();
			++i;		
		}
		
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		System.out.println("--------------------");
		
		for(int i=0; i<mas.length; i++) {
		int min = mas[i];
		int index = i;
		for(int j=i+1; j<mas.length; j++) {
			if (mas[j]<min) {
				min = mas[j];
				index = j;
			}
		}
		
		if (i!=index) {
			int tmp = mas[i];
			mas[i]=mas[index];
			mas[index]=tmp;
		}
		
	}
	for(int i=0; i<mas.length; i++) {
		System.out.println(mas[i]);
	}
		
	
		
	}
	
	


}


//for(int i=0; i<5; i++) {
//	int min = tri.getNumberTrain;
//	int index = i;
//	for(int j=i+1; j<mas.length; j++) {
//		if (mas[j]<min) {
//			min = mas[j];
//			index = j;
//		}
//	}
//	
//	if (i!=index) {
//		int tmp = mas[i];
//		mas[i]=mas[index];
//		mas[index]=tmp;
//	}
//	
//}
//for(int i=0; i<mas.length; i++) {
//	System.out.println(mas[i]);
//}