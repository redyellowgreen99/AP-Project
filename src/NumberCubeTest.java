import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCubeTest {

	/* READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf */

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5};
		assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));
		int[] testValues2 = { 1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(6, NumberCubeQuestion.getLongestRun(testValues2));
	}

}

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
}


