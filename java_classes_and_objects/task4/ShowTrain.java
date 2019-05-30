package java_classes_and_objects.task4;

import java.util.List;
import java.util.Scanner;

public class ShowTrain {
	private List <Train> trains;
	private int numberTrain = enter("input number train");
	
	public void serch(ListTrains lit) {
		trains = lit.getTrains();
		for(Train tr:trains) {
			if(tr.getNumberTrain()==numberTrain) {
				System.out.println(tr);
			}
//			else {
//				System.out.println("left");
//				break;
//			}
		}
		
	}
	
	public static int enter (String message ) {
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println(message);
		
		while(sc.hasNextInt()==false) {
			String s = sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		c=sc.nextInt();
		return c;
	}

}
