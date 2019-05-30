package java_classes_and_objects.task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Train tr1 = new Train("Minsk", 521, "12.00");
		Train tr2 = new Train("Moscow", 23, "19.00");
		Train tr3 = new Train("Geben", 425, "15.00");
		Train tr4 = new Train("Duko", 285, "15.00");
		Train tr5 = new Train("Duko", 535, "11.00");
		
		
		ListTrains lit = new ListTrains();
		lit.add(tr1);
		lit.add(tr2);		
		lit.add(tr3);
		lit.add(tr4);
		lit.add(tr5);
		
		System.out.println(lit.getTrains());
		System.out.println("--------------------");
		
		ShowTrain shtr = new ShowTrain();
		shtr.serch(lit);
		System.out.println("--------------------");
//		SortingTrains sortr = new SortingTrains();
//		sortr.Sorting(lit);

//		System.out.println(lit.getTrains());
		
		AddToMas add = new AddToMas();
		add.Add(tr1);
		add.Add(tr2);
		add.Add(tr3);
		add.Add(tr4);
		add.Add(tr5);
		
	
		
		SortingMas sm = new SortingMas();
		sm.Sorting(add.getTrains());
		
		System.out.println("--------------------");
		
		SortingString ss = new SortingString();
		ss.Sorting(add.getTrains());
		
		
		
		
	}

}
