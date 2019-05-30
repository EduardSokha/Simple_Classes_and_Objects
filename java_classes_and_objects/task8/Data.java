package java_classes_and_objects.task8;

import java.util.ArrayList;
import java.util.List;


public class Data {
	
private List <Customer> data = new ArrayList<Customer>();
	
	public void add(Customer cl) {
		data.add(cl);
	}
	
	public void remove(Customer cl) {
		data.remove(cl);
	}

	public List<Customer> getData() {
		return data;
	}

	

	
	

}
