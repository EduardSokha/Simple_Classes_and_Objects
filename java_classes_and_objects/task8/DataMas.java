package java_classes_and_objects.task8;


public class DataMas {
	Customer[] clients = new Customer[5];
	private int i = 0;
	
	public void Add(Customer cl){		
		clients[i]=cl;
		i++;		
	}
	
	public void sout(){
		for(int j=0; j<clients.length; j++) {
		System.out.println(clients[j]);	
		}
	}

	public Customer[] getClients() {
		return clients;
	}
	
	

}
