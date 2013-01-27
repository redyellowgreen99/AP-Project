public class GreyImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;

	int[][] name = { { 255, 184, 178, 84, 129 }, { 84, 255, 255, 130, 84 },
			{ 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };

	private int[][] pixelValues;

	public static int[][] createTestArray() {
		int[][] name = { { 255, 184, 178, 84, 129 }, { 84, 255, 255, 130, 84 },
				{ 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };
		return name;
	}

	public void setPixelValues(int[][] name) {
		this.pixelValues = name;
	}

	public int[][] getPixelValues() {
		return pixelValues;
	}

	public int countWhitePixels() {
		int whitePixels = 0;
		for (int i = 0; i < pixelValues.length; i++) {
			for (int j = 0; j < pixelValues[i].length; j++) {
				pixelValues[i][j] = name[i][j];
				if (pixelValues[i][j] == 255) {
					whitePixels++;
				}
			}
		}

		return whitePixels;
	}

	public static boolean areSame(int[][] name, int[][] helloMyNameIs) {
		boolean equal = false;
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				if (name[i][j] != helloMyNameIs[i][j]) {
					equal = false;
					return equal;
				} else {
					equal = true;
				}
			}
		}
		return equal;
	}

	public void processImage() {
		for (int i = 0; i < pixelValues.length - 2; i++) {
			for (int j = 0; j < pixelValues[i].length - 2; j++) {
				int temp = pixelValues[i][j] - pixelValues[i + 2][j + 2];
				if (temp < 0) {
					temp = 0;
				}
				pixelValues[i][j] = temp;
			}
		}
	}
}
