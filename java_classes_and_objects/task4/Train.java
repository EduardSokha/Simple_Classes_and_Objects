package java_classes_and_objects.task4;

public class Train {
	String destination;
	int numberTrain;
	String depatureTime;
	
	public Train (String destination, int numberTrain, String depatureTime) {
		this.destination = destination;
		this.numberTrain = numberTrain;
		this.depatureTime = depatureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depatureTime == null) ? 0 : depatureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberTrain;
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
		Train other = (Train) obj;
		if (depatureTime == null) {
			if (other.depatureTime != null)
				return false;
		} else if (!depatureTime.equals(other.depatureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberTrain != other.numberTrain)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", numberTrain=" + numberTrain + ", depatureTime=" + depatureTime
				+ "]";
	}
	
	
	
	
}
