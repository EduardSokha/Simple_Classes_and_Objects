package java_classes_and_objects.task9;

import java.util.Scanner;

public class Sorting {
	private Book[] books;
	String author;
	String edit;
	int year;
	
	public Sorting(Book[] books) {		
		this.books=books;
	}
	
	public void ShowAuthor() {
		author=enter("enter author");
		for(int i=0; i<books.length; i++) {
				if (books[i].getAuthor().compareTo(author)==0) {
					System.out.println(books[i]);
				}
//				else {
//					System.out.println("left");
//					break;
//				}		
		}
		
//		for(int j=0; j<clients.length; j++) {
//			System.out.println(clients[j]);
//		}
		System.out.println("--------------------");
	}	
	
	public void ShowEdit() {
		edit=enter("enter edition");
		for(int i=0; i<books.length; i++) {
			if (books[i].getEdition().compareTo(edit)==0) {
				System.out.println(books[i]);
			}
//			else {
//				System.out.println("left");
//				break;
//			}		
		}
		System.out.println("--------------------");
	}
	
	public void ShowYear() {
		year=enter1("enter year");
		for(int i=0; i<books.length; i++) {
			if (books[i].getYearEdit()>year) {
				System.out.println(books[i]);
			}
//			else {
//				System.out.println("left");
//				break;
//			}		
		}
		
	}
	
	
	
	
	
	
	
	public static String enter (String message ) {
		Scanner sc = new Scanner(System.in);
		String c;
		System.out.println(message);
		
		c=sc.next();
		return c;
	}
	
	public static int enter1 (String message ) {
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
