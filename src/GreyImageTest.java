import org.junit.Assert;
import junit.framework.TestCase;

public class GreyImageTest extends TestCase {

	/*
	 * 1. Attempt Question 4, part (a) from the 2012 free response section.
	 * http:
	 * //apcentral.collegeboard.com/apc/public/repository/ap_frq_computerscience_12
	 * .pdf
	 */

	/* Create the sample 2D array at the bottom of page 18 */

	public void testCreateTestArray() {

		int[][] testArray = GreyImage.createTestArray();
		assertEquals(130, testArray[3][1]);
		assertEquals(255, testArray[0][0]);
		assertEquals(130, testArray[3][1]);
		assertEquals(84, testArray[3][4]);
	}

	/* Make the data in GreyImage accessible to the following tests. */

	public void testPixelValuesSetterAndGetter() throws Exception {

		int[][] testPixelValues = GreyImage.createTestArray();
		GreyImage greyImage = new GreyImage();
		greyImage.setPixelValues(testPixelValues);
		assertEquals(130, greyImage.getPixelValues()[3][1]);
		assertEquals(255, greyImage.getPixelValues()[0][0]);
		assertEquals(130, greyImage.getPixelValues()[3][1]);
		assertEquals(84, greyImage.getPixelValues()[3][4]);
	}

	/* Implement exam question part (a) */

	public void testPartA() throws Exception {

		// set up

		int[][] testPixelValues = GreyImage.createTestArray();
		GreyImage greyImage = new GreyImage();
		greyImage.setPixelValues(testPixelValues);

		// assert
		assertEquals(5, greyImage.countWhitePixels());
	}

	private static int[][] beforeCallToProcessImage = {
			{ 221, 184, 178, 84, 135 }, { 84, 255, 255, 130, 84 },
			{ 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };

	private static int[][] afterCallToProcessImage = {
			{ 221, 184, 100, 84, 135 }, { 0, 125, 171, 130, 84 },
			{ 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };

	/* Implement a method that compares two 2D arrays */

	public void testEqualityOfTwo2DArrays() throws Exception {
		assertEquals(true, GreyImage.areSame(afterCallToProcessImage,
				afterCallToProcessImage));
		assertEquals(false, GreyImage.areSame(GreyImage.createTestArray(),
				afterCallToProcessImage));
	}

	/* Attempt part (b) on paper, then implement it here. */

	public void testPartB() throws Exception {

		// set up
		GreyImage greyImage = new GreyImage();
		greyImage.setPixelValues(beforeCallToProcessImage);

		// process
		greyImage.processImage();

		// assert
		assertTrue(GreyImage.areSame(afterCallToProcessImage,
				greyImage.getPixelValues()));

		// Assert.assertArrayEquals(afterCallToProcessImage,
		// greyImage.getPixelValues());
	}
}
