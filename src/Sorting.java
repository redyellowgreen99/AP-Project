public class Sorting {
	public static String[] sort(String[] array) {
		String[] newArray = new String[array.length];
		String winner = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (winner.compareTo(array[j]) < 0) {
					winner = array[j];
					if(j == array.length - 1){
						array[j] = "zzzzzzzzzz";
					}
				}
				for(String q:array){
					System.out.println(q);
				}
			}
			
			newArray[i] = winner;
		}
		for(String i:newArray){
			System.out.println(i);
		}
		return newArray;
	}
}
