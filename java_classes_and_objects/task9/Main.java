package java_classes_and_objects.task9;



public class Main {

	public static void main(String[] args) {
		
			Book b1 = new Book(565, "hi", "duko", "minsk", 2011, 200, 15, "l,l,");
			Book b2 = new Book(565, "hi", "geben", "moscow", 2012, 200, 15, "l,l,");
			Book b3 = new Book(565, "hi", "lu", "ussr", 2013, 200, 15, "l,l,");
			Book b4 = new Book(565, "hi", "go", "minsk", 2014, 200, 15, "l,l,");
			Book b5 = new Book(565, "hi", "duko", "ussr", 2015, 200, 15, "l,l,");
			
			DataMas bm = new DataMas();
			bm.Add(b1);
			bm.Add(b2);
			bm.Add(b3);
			bm.Add(b4);
			bm.Add(b5);
			bm.sout();
			System.out.println("--------------------");
			
			Sorting sort = new Sorting(bm.getBooksinf());
			sort.ShowAuthor();
			sort.ShowEdit();
			sort.ShowYear();
			
			
			System.out.println("--------------------");
				
			
				
				

			
			
			
		}

	}


