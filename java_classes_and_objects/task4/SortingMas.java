package java_classes_and_objects.task4;

public class SortingMas {
	Train[] listrain;
	
	public void Sorting(Train[] tr) {
		listrain = tr;		
		for(int i=0; i<listrain.length; i++) {
			int min = listrain[i].getNumberTrain();
			int index = i;
			for(int j=i+1; j<listrain.length; j++) {
				if (listrain[j].getNumberTrain()<min) {
					min = listrain[j].getNumberTrain();
					index = j;
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
