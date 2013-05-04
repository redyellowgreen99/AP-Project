import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/* http://apcentral.collegeboard.com/apc/public/repository/ap10_frq_computer_science_a.pdf */

public class TestsFor2010AP extends TestCase {
	/******* 2010 Free Response Question 3, Part (a) *********/

	int[] markers = { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 };

	public void testIsLevel() {
		assertEquals(true, isLevelTrailSegment(7, 10));
		assertEquals(false, isLevelTrailSegment(2, 12));
	}

	public boolean isLevelTrailSegment(int start, int end) {
//		if(markers[start] - markers[end] <= 10 && markers[start] - markers[end] >= -10) {
//			return false;
//		} else {
//			return true;
//		}
		int total = 0;
		int largest = 0;
		int smallest = 150;
		for(int i = start; i < end + 1; i++) {
			if(markers[i] > largest) {
				largest = markers[i];
			}
			if(markers[i] < smallest) {
				smallest = markers[i];
			}
		}
		if(largest - smallest <= 10) {
			return true;
		}
		
		System.out.println(largest);
		System.out.println(smallest);
		return false;
	}

	/******* 2010 Free Response Question 1, Part (b) *********/

	List<CookieOrder> orders = new ArrayList<CookieOrder>();

	class CookieOrder {
		String variety;		int numBoxes;

		CookieOrder(String variety, int numBoxes) {
			this.variety = variety;
			this.numBoxes = numBoxes;
		}
		
		int getNumBoxes(){return numBoxes;}
		String getVariety(){return variety;}
	}
	{
		orders.add(new CookieOrder("Chocolate Chip", 1));
		orders.add(new CookieOrder("Shortbread", 5));
		orders.add(new CookieOrder("Macaroon", 2));
		orders.add(new CookieOrder("Chocolate Chip", 3));
	}

	public void testRemoveVariety() throws Exception {
		assertEquals(0, removeVariety("Brownie"));
		assertEquals(2, removeVariety("Macaroon"));
		assertEquals(4, removeVariety("Chocolate Chip"));
	}

	private int removeVariety(String string) {
		int LikeAGeek = 0;
		for(int i = 0; i < orders.size(); i++) {
			if(string.equals(orders.get(i).getVariety())) {
				LikeAGeek += orders.get(i).getNumBoxes();
				orders.remove(i);
				i -= 1;
			}
		}
		return LikeAGeek;
	}
}