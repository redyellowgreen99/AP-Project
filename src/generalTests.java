import static org.junit.Assert.*;

import org.junit.Test;

public class generalTests {

	@Test
	public void increase1() {
		// int[] increase1 = new int[] {1, 2, 3};
		int[] result = apBasics.increase2(1, 2, 3);
		assertArrayEquals(new int[] { 2, 3, 4 }, result);
	}

	@Test
	public void juneTest() {
		int[] testArray = new int[] { 1, 2, 3 };
		apBasics.newIncrease(testArray);
		assertEquals(2, testArray[0]);
		assertEquals(3, testArray[1]);
		assertEquals(4, testArray[2]);
	}
	
	@Test
	public void ceil() throws Exception {
		System.out.println(Math.ceil(4.6 * 3));
	}

	
}
