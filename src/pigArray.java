import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class pigArray {

	public static void main(String[] args) {
		Pig pig = new Pig(32, "firstPig", "pink"); // Add and declare a pig
		ArrayList<Pig> PigList = new ArrayList<Pig>(); // Create an ArrayList
		PigList.add(pig); // Add the pig to the ArrayList
		PigList.add(new Pig(12, "secondPig", "dark pink")); // Add new pigs to the ArrayList
		PigList.add(new Pig(36, "thirdPig", "unsaturated pink"));
		PigList.add(new Pig(18, "forthPig", "extra contrast pink"));
		getBaconSlices(PigList); // Run getBaconSlices
		harvestBacon(PigList); // Run harvestBacon
		getStats(pig);
	}

	public static int getBaconSlices(ArrayList<Pig> PigList) {
		int totalNumberOfBaconSlices = 0; // Total Number of Bacon Slices
		for (Pig p : PigList) { // For each loop
			totalNumberOfBaconSlices = totalNumberOfBaconSlices
					+ p.getBaconSlices(); // Add up the bacon slices
		}
		System.out.println("Total Number Of Bacon Slices: "
				+ totalNumberOfBaconSlices); // Print out the bacon slices
		return totalNumberOfBaconSlices; // Return the bacon slices
	}
	
	public static void getStats(Pig pig) {
		System.out.println("Pig:\n" + pig.getName() + "\nBaconslices:\n" + pig.getBaconSlices() + "\nColor:\n" + pig.getColor());
	}
	
	public static String getColor(Pig pig) {
		System.out.println("The pig, " + pig + " is the color " + pig.getColor());
		return pig.getColor();
	}
	
	public static int getNumberColors(ArrayList<Pig> PigList) {
		int totalColors = 0;
		for (Pig p : PigList) {
			totalColors = PigList.size();
		}
		return totalColors;
	}

	public static void harvestBacon(ArrayList<Pig> PigList) {
		for (Pig p : PigList) { // For each loop
			p.setBaconSlices(0); // Set the bacon slices to zero
			System.out.println("Harvested: " + p.getBaconSlices()); // Print
																	// out
																	// the
																	// bacon
																	// slices
		}
		PigList.clear();
	}
}
