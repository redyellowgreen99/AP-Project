public class Pig {

	int numberOfBaconSlices; //Create an int
	String color;
	String name;

	public static void main(String[] args) {

	}

	public Pig(int numberOfBaconSlices, String name, String color) { //Pig constructor
		this.numberOfBaconSlices = numberOfBaconSlices; //Set the ints to each other
		this.color = color;
		this.name = name;
	}
	
	public String getName() { //Create a getter
		return name;
	}

	public int getBaconSlices() { //Create a getter
		return numberOfBaconSlices; //Return the number of bacon slices to the other class
	}
	
	public String getColor() { //Create a getter
		return color; //Return the color to the other class
	}
	
	public void setBaconSlices(int setTo) { //Create a setter
		numberOfBaconSlices = setTo; //set to the parameter's int
	}

	public void setColor(String setTo) { //Create a setter
		color = setTo; //set to the parameter's int
	}
}
