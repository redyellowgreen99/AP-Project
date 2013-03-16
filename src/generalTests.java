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
	
	@Test
	public void main() {
	        int x = 1;
	        int y = 2;
	        int z = 3;
	        
	        z = mystery(x, z, y);                        // Statement 1
	        System.out.println(x + " " + y + " " + z);   // Statement 2
	        x = mystery(z, z, x);                        // Statement 3
	        System.out.println(x + " " + y + " " + z);   // Statement 4
	        y = mystery(y, y, z);                        // Statement 5
	        System.out.println(x + " " + y + " " + z);   // Statement 6
	    }

	    public int mystery(int z, int x, int y) {
	        z--;
	        x = 2 * y + z;
	        y = x - 1;
	        System.out.println(y + " " + z);
	        return x;
	    }
	    
	    @Test
	    public void annoyingProblem() {
	    	String str2 = "Arcturan Megadonkey";
	    	String str3 = "Sirius Cybernetics Corporation";
	    	
	    	Integer.parseInt(str3);
	    	
	    }
	    }