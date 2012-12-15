import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jokes {
	public static void main(String[] args) {
		Random r = new Random(); //Make a random variable BECAUSE I SAID SO!
		r.nextInt(4);
		System.out.println("Random Number: " + r.nextInt(1000000));
		ArrayList<String> jokesList = new ArrayList<String>();
		jokesList.add("Why did the chicken cross the road?");
		jokesList.add("Why couldn't the programmer complete his program?");
		ArrayList<String> punchLinesList = new ArrayList<String>();
		punchLinesList.add("Because it's a stupid chicken!");
		punchLinesList.add("Because he can't think of any jokes to put in this array!");
		punchLinesList.add("He wanted to go to El Pollo Loco!");
		punchLinesList.add("If I said the answer to that very bad joke, I'd have to explain it in my languge.");
		
		String[] jokes = new String[] { "Why did the chicken cross the road?",
				"Why couldn't the programmer complete his program?" };
		String[] punchLines = new String[] { "Because it's a stupid chicken!",
				"Because he can't think of any jokes to put in this array!" };
		JOptionPane.showMessageDialog(null, jokesList.get(r.nextInt(jokesList.size())));
		JOptionPane.showMessageDialog(null, punchLinesList.get(r.nextInt(punchLinesList.size())));
		JOptionPane.showMessageDialog(null, jokesList.get(r.nextInt(jokesList.size())));
		JOptionPane.showMessageDialog(null, punchLinesList.get(r.nextInt(punchLinesList.size())));
	}
}
