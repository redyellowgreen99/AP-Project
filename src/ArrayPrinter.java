public class ArrayPrinter {

	public static void main(String[] args) {
		int arrayList[][] = { { 1, 6, 7, 10, 17 }, { 7, 5, 4, 8 } };
		int arrayList2[][] = { { 1, 6, 7, 10, 17 }, { 7, 5, 4, 8, } };
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 3, 4 } };
		printingPress(array);
		index(arrayList, 7);
		printingPress(7, 3, "W", "O");
		printingPress(4, 4, "X", "O");
		System.out.println("\nCrafting Table");
		printingPress(5, 5, "X", "_");
		equal(arrayList, arrayList2);
		System.out.println(equal(arrayList, arrayList2));
	}

	public static void printingPress(int Array[][]) {
		System.out.println("It's dangerous to code alone. Compile this.");
		for (int row = 0; row < Array.length; row++) {
			for (int column = 0; column < Array[row].length; column++) {
				System.out.print(Array[row][column] + "\t");
			}
			System.out.println();
		}
	}

	public static void sendToPrintingPress(String Array[][]) {
		System.out.print("\n");
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void printingPress(int height, int width, String letter1,
			String letter2) {
		String array[][] = new String[width][height];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
					array[i][j] = letter1;
				} else {
					array[i][j] = letter2;
				}
			}
		}
		sendToPrintingPress(array);
	}

	public static int index(int Array[][], int number) {
		int quantity = 0;
		for (int row = 0; row < Array.length; row++) {
			for (int column = 0; column < Array[row].length; column++) {
				if (Array[row][column] == number) {
					quantity++;
				}
			}
		}
		System.out.println("\nIndexing: \n" + quantity + " " + number + "'s");
		return quantity;
	}

	public static boolean equal(int Array1[][], int Array2[][]) {
		for (int i = 0; i < Array1.length; i++) {
			for (int j = 0; j < Array1[i].length; j++) {
				if (Array1[i][j] != Array2[i][j]) {
					return false;
				}
			}
		}
		if (Array1[0][0] != Array2[0][0]) {
			return false;
		}
		return true;
	}
	
	public static int countSuperHeroes(int Array[][], int height, int width, String cell1x1, String cell1x2, String cell1x3, String cell1x4, String cell2x1, String cell2x2, String cell2x3, String cell2x4, String cell3x1, String cell3x2, String cell3x3, String cell3x4, String cell4x1, String cell4x2, String cell4x3, String cell4x4) {
		int numberOfHeroes = 0;
		
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
//				Array[i][j] = cell1x1;
			}
		}
		return numberOfHeroes;
	}
}