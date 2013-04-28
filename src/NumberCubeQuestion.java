public class NumberCubeQuestion {

	public static void main(String[] args) {
		
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numberTosses) {
		int[] intArray = new int[numberTosses];
		for(int i = 0; i < numberTosses; i++) {
			intArray[i] = cube.toss();
		}
		return intArray;
	}
	
	public static int getLongestRun(int[] values) {
		int longest = 0;
		int lastValue = values[0];
		int lastRunLength = 1;
		int indexStart = 0;
		int indexOfLongest = 0;
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			if(lastValue == values[i]) { //Checks if the last value is equal to this value
				lastRunLength++;
			} else {
				System.out.println("Last Run Length: " + lastRunLength);
				System.out.println("Longest: " + longest);
				if(lastRunLength > longest) {
					longest = lastRunLength;
					lastRunLength = 0;
					indexOfLongest = indexStart;
					System.out.println("New Longest: " + indexOfLongest);
				}
				indexStart = i;
			}
			lastValue = values[i];
		}
		return indexOfLongest;
	}

}
