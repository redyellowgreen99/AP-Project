import java.awt.List;
import java.util.ArrayList;

public class Traversals {
	public static String arrayToString(String[] strings) {
		String string = "";
		for (int i = 0; i < strings.length; i++) {
			string = string + strings[i];
		}
		System.out.println(string);
		return string;
	}

	public static String arrayListToString(ArrayList<String> testList) {
		String anotherString = "";
		for(int i = 0; i < testList.size(); i++) {
			anotherString = anotherString + testList.get(i);
		}
		System.out.println(anotherString);
		return anotherString;
	}
	
	public static String getAnimalNames(ArrayList<Animal> animals)
	{
		String anotherString1 = "";
		for (int i = 0; i < animals.size(); i++) {
			anotherString1 = anotherString1 + animals.get(i).animalsToString();
		}
		return anotherString1;
	}
}
