package java_classes_and_objects.task4;

public class AddToMas {
	Train[] trains = new Train[5];
	private int i = 0;
	
	public void Add(Train tr){
		
		trains[i]=tr;
		i++;		
	}
	public void sout(){
		for(int i=0; i<trains.length; i++) {
		System.out.println(trains[i]);	
		}
	}
	public Train[] getTrains() {
		return trains;
	}
	

}
