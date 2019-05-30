package java_classes_and_objects.task8;



public class Sorting {
	private Customer[] clients;
	
	public void Sort(Customer[] cl) {
		clients = cl;		
		for(int i=0; i<clients.length; i++) {
			String min = clients[i].getName();
			int index = i;
			for(int j=i+1; j<clients.length; j++) {
				if (clients[j].getName().compareTo(min)<0) {
					min = clients[j].getName();
					index = j;
				}
			}
			
			if (i!=index) {
				Customer tmp = clients[i];
				clients[i]=clients[index];
				clients[index]=tmp;
			}
		}
		
		for(int j=0; j<clients.length; j++) {
			System.out.println(clients[j]);
		}
	}	

}
