import java.util.ArrayList;
import java.util.Random;


public class randomArray {

	public static void main(String[] args) {
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		for(int i = 0; i < 1000; i++) {
			randomNumbers.add((int)new Random().nextInt(1000));
			if(i / 10 == 1) {
				System.out.println(randomNumbers.get(i));
			} else {
			System.out.println(randomNumbers.get(i));
			}
		}
	}

}
