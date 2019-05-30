package java_classes_and_objects.task4;

import java.util.ArrayList;
import java.util.List;

public class ListTrains {
	private List <Train> trains = new ArrayList<Train>();
	
	public void add(Train tr) {
		trains.add(tr);
	}
	
	public void remove(Train tr) {
		trains.remove(tr);
	}

	public List<Train> getTrains() {
		return trains;
	}
	
}
