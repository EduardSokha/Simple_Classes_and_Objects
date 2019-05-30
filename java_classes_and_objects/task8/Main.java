package java_classes_and_objects.task8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cl1 = new Customer("duko", 23, "minsk", 20, 54);
		Customer cl2 = new Customer("fed", 23, "minsk", 24, 54);
		Customer cl3 = new Customer("lu", 23, "minsk", 26, 54);
		Customer cl4 = new Customer("aid", 23, "minsk", 28, 54);
		Customer cl5 = new Customer("dom", 23, "minsk", 30, 54);
		
		
		
		Data d = new Data();
		d.add(cl1);
		d.add(cl2);
		d.add(cl3);
		d.add(cl4);
		d.add(cl5);
		
//		SortingData sd = new SortingData();		
//		sd.G(d);
		
		DataMas dm = new DataMas();
		dm.Add(cl1);
		dm.Add(cl2);
		dm.Add(cl3);
		dm.Add(cl4);
		dm.Add(cl5);
		dm.sout();
		
		System.out.println("--------------------");
		
		Sorting sort = new Sorting();
			sort.Sort(dm.getClients());
			
		System.out.println("--------------------");
			
		OutClients oc = new OutClients();
		oc.Sort(dm.getClients());
			
			

		
		
		
	}
			
}
