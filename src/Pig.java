public class Pig {

	int numberOfBaconSlices; //Create an int

	public static void main(String[] args) {

	}

	public Pig(int numberOfBaconSlices, String name) { //Pig constructor
		this.numberOfBaconSlices = numberOfBaconSlices; //Set the ints to each other
	}

	public int getBaconSlices() { //Create a getter
		return numberOfBaconSlices; //Return the number of bacon slices to the other class
	}
	
	public void setBaconSlices(int setTo) { //Create a setter
		numberOfBaconSlices = setTo; //set to the parameter's int
	}

}
