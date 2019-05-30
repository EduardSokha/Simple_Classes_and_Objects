package java_classes_and_objects.task4;

public class SortingString {
	Train[] listrain;
	
	public void Sorting(Train[] tr) {
		listrain = tr;		
		for(int i=0; i<listrain.length; i++) {
			String min = listrain[i].getDestination();
			String min2 = listrain[i].getDepatureTime();
			int index = i;
			for(int j=i+1; j<listrain.length; j++) {
				if (listrain[j].getDestination().compareTo(min)<0) {
					min = listrain[j].getDestination();
					index = j;
				}
				if (listrain[j].getDestination().compareTo(min)==0) {
					
					if(listrain[j].getDepatureTime().compareTo(min2)<0) {
						min2=listrain[j].getDepatureTime();
						index = j;
						
					}
				}
			}
			
			if (i!=index) {
				Train tmp = listrain[i];
				listrain[i]=listrain[index];
				listrain[index]=tmp;
			}
			
						
		}
		for(int j=0; j<listrain.length; j++) {
			System.out.println(listrain[j]);
		}
	}
	

}
