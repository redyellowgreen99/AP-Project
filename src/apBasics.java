public class apBasics {

	public static void main(String[] args) {
		add1(5, 8);
		odd1(4);
		int[] array1 = new int[] { 1, 2, 3, 5, 7 };
		max1(array1);
		String[] stringArray2 = names1();
		for (int i = 0; i < stringArray2.length; i++) {
			System.out.println(stringArray2[i]);
		}
		int[] array2 = new int[] { 1, 2, 4, 6, 8 };
		increase1(array2);
	}

	public static int add1(int int1, int int2) {
		System.out.println(int1 + int2);
		return int1 + int2;
	}

	public static boolean odd1(int int1) {
		if (int1 % 2 == 1) {
			System.out.println("True: Odd");
			return true;
		} else {
			System.out.println("False: Even");
			return false;
		}
	}

	public static int max1(int[] array1) {
		int maximumInt = 0;
		for (int i = 0; i < array1.length; i++) {
			if (maximumInt < array1[i]) {
				maximumInt = array1[i];
			}
		}
		System.out.println(maximumInt);
		return maximumInt;
	}

	public static String[] names1() {
		String[] stringArray1 = new String[] { "Drew", "Alex", "Vic", "June",
				"Robert" };

		return stringArray1;
	}

	public static int[] increase1(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			array2[i]++;
			System.out.println(array2[i]);
		}
		return array2;
	}
}
