package java_classes_and_objects.task8;

import java.util.Scanner;

public class OutClients {
private Customer[] clients;
private int k = enter("number card from ");
private int j = enter("to ");
	
	public void Sort(Customer[] cl) {
		clients = cl;
		for(int i=0; i<clients.length; i++) {
			if (clients[i].getCreditCard()>k && clients[i].getCreditCard()<j ) {
				System.out.println(clients[i]);
			}
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
