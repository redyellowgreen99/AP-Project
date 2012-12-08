import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class FindMaxAndMacky {
	HaciendaBuilding laHacienda = new HaciendaBuilding();

	@Test
	public void testHidingPlace() throws Exception {
		HidingPlace aLocation = new HidingPlace("under the stairs", "max");
		assertEquals("under the stairs", aLocation.getName());
		assertEquals("max", aLocation.getHider());

		HidingPlace bLocation = new HidingPlace("on the roof");
		assertEquals("on the roof", bLocation.getName());
		assertEquals(null, bLocation.getHider());
	}

	/* Create an old school array of HidingPlaces of size 3 */
	@Test
	public void testArrayOfLocations() {
		HidingPlace[] hideOuts = laHacienda.initializeOldSchoolArrayOfLocations();
		assertEquals(3, hideOuts.length);
		System.out.println("dfdsf" + hideOuts[0].getName().toString());
		assertTrue(hideOuts[0].getClass().getName().contains("HidingPlace"));
	}

	/* Create an ArrayList of HidingPlaces of size 3 */
	@Test
	public void testArrayListOfLocations() {
		HaciendaBuilding laHacienda = new HaciendaBuilding();
		assertEquals(3, laHacienda.initializeArrayListOfLocations().size());
		assertTrue(laHacienda.initializeArrayListOfLocations().get(0).getName() != "");
	}

	@Test
	public void testFindInArray() throws Exception {
		HidingPlace[] hideOuts = new HidingPlace[] { new HidingPlace("here", "max"), new HidingPlace("there"), new HidingPlace("everywhere", "macky") };
		laHacienda.setHidingPlaces(hideOuts);
		assertEquals(0, laHacienda.findMax());
		assertEquals(2, laHacienda.findMacky());
	}

	@Test
	public void testFindInArrayList() throws Exception {
		ArrayList<HidingPlace> hideOuts = new ArrayList<HidingPlace>();
		hideOuts.add(new HidingPlace("here"));
		hideOuts.add(new HidingPlace("there", "milena"));
		hideOuts.add(new HidingPlace("everywhere", "macky"));
		laHacienda.setHidingPlaces(hideOuts);
		assertEquals(true, laHacienda.isMilenaHere());
		assertEquals(false, laHacienda.isMaxHere());
		assertEquals(true, laHacienda.isMackyHere());
		// TODO: refactor these 3 methods to reduce duplication
	}
}

