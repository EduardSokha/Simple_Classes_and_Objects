package java_classes_and_objects.task8;

public class Customer {
	private String name;
	private int id;
	private String address;
	private int creditCard;
	private int bankAccount;
	
	public Customer(String name, int id, String address, int creditCard, int bankAccount) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
		
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + creditCard;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getCreditCard() {
		return creditCard;
	}



	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}



	public int getBankAccount() {
		return bankAccount;
	}



	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", address=" + address + ", creditCard=" + creditCard
				+ ", bankAccount=" + bankAccount + "]";
	}

	
	
	

}
