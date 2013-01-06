import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/* These tests teach the Traversals section of "Section V - A" in the AP exam.
 * http://www.collegeboard.com/student/testing/ap/compsci_a/topic.html?compscia
 *  */

public class TraversalTest extends TestCase {

	/*
	 * Iterate through an array and concatenate (add up) its contents into a
	 * single String.
	 */
	public void testTraverseArray() throws Exception {
		String[] strings = { "i", "like", "trains" };
		assertEquals("iliketrains", Traversals.arrayToString(strings));
	}

	public void testTraverseArray2() throws Exception {

		String[] moreStrings = { "do", "not", "ask", "permission" };
		assertEquals("donotaskpermission",
				Traversals.arrayToString(moreStrings));
	}

	public void testTraverseList() throws Exception {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("robert");
		testList.add("really");
		testList.add("likes");
		testList.add("coffee");
		assertEquals("robertreallylikescoffee",
				Traversals.arrayListToString(testList));
	}

	public void testTraverseList2() throws Exception {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("always");
		testList.add("say");
		testList.add("never");
		assertEquals("alwayssaynever", Traversals.arrayListToString(testList));
	}

	public void testMoreArrayListTraversals() {
		Animal duck1 = new Animal("duck");
		Animal duck2 = new Animal("duck");
		Animal goose = new Animal("goose");
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(duck1);
		animals.add(duck2);
		animals.add(goose);
		assertEquals("duckduckgoose", Traversals.getAnimalNames(animals));

		animals.clear();
		animals.add(goose);
		animals.add(duck1);
		assertEquals("gooseduck", Traversals.getAnimalNames(animals));
	}

	 /* practice:
	 * twitter & processing
	 * Person (name, height), print out smallest to tallest in class
	 *
	 * now solve these puzzles:
	 * 1. use old school arrays -
	 http://www.pythonchallenge.com/pc/def/map.html
	 * 2. use an ArrayList - http://www.pythonchallenge.com/pc/def/ocr.html
	 */


	
	
//	 public void testSortAnArray() throws Exception {
//	 String[] testArray = { "concerned", "affected", "fascinated",
//	 "intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
//	 "engrossed", "curious" };
//	 testArray = Sorting.sort(testArray);
//	 assertEquals("absorbed", testArray[0]);
//	 assertEquals("affected", testArray[1]);
//	 assertEquals("concerned", testArray[2]);
//	 assertEquals("curious", testArray[3]);
//	 assertEquals("engrossed", testArray[4]);
//	 assertEquals("fascinated", testArray[5]);
//	 assertEquals("snoopy", testArray[testArray.length]);
//	 }

//	 public void testInsertIntoArray() {
//	 int[] testArray = { 3, 6, 8, 3, 3, 2, 98 };
//	 Inserting.insertAt(testArray, 5);
//	 assertEquals(3, testArray[0]);
//	 assertEquals(3, testArray[5]);
//	 assertEquals(3, testArray[6]);
//	 }
	//
	// public void testInsertInOrder() throws Exception {
	// String[] orderedArray = { "concerned", "affected", "fascinated",
	// "intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
	// "engrossed", "curious" };
	// Sorting.sort(orderedArray);
	//
	// Inserting.insertAlphabetically(orderedArray, "groovy");
	// assertEquals("absorbed", orderedArray[0]);
	// assertEquals("groovy", orderedArray[6]);
	// assertEquals("snoopy", orderedArray[8]);
	// }

	// // insert into ArrayList
	//
	// // deletion from array
	//
	// // deletion from arraylist

	// * AP sample questions:
	// * 1.
	// http://apcomputersciencetutoring.com/exam-review/candidatepool-free-response-practice-question/
	// * 2.
	// http://apcentral.collegeboard.com/apc/public/repository/ap_frq_computerscience_12.pdf
	// */

}