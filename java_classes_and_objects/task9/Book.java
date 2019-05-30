package java_classes_and_objects.task9;

public class Book {
	private int id;
	private String name;
	private String author;
	private String edition;
	private int yearEdit;
	private int pages;
	private int price;
	private String binding;
	
	public Book(int id, String name, String author,  String edition, int yearEdit, int pages, int price, String binding) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.yearEdit = yearEdit;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getYearEdit() {
		return yearEdit;
	}

	public void setYearEdit(int yearEdit) {
		this.yearEdit = yearEdit;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + ((edition == null) ? 0 : edition.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		result = prime * result + price;
		result = prime * result + yearEdit;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (edition == null) {
			if (other.edition != null)
				return false;
		} else if (!edition.equals(other.edition))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		if (price != other.price)
			return false;
		if (yearEdit != other.yearEdit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", edition=" + edition + ", yearEdit="
				+ yearEdit + ", pages=" + pages + ", price=" + price + ", binding=" + binding + "]";
	}
	
	
	
	
	
	
}
