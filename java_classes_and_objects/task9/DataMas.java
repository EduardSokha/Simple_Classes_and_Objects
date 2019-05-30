package java_classes_and_objects.task9;


public class DataMas {
	Book[] booksinf = new Book[5];
	private int i = 0;
	
	public void Add(Book cl){		
		booksinf[i]=cl;
		i++;		
	}
	
	public void sout(){
		for(int j=0; j<booksinf.length; j++) {
		System.out.println(booksinf[j]);	
		}
	}

	public Book[] getBooksinf() {
		return booksinf;
	}

	

	
	
	
	

}
