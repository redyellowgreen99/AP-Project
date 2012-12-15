import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class apBasics extends JComponent{

	public static void main(String[] args) {
		add1(5, 8);
		odd1(8);
		int[] array1 = new int[] { 1, 2, 3, 5, 7 };
		max1(array1);
		String[] stringArray2 = names1();
		for (int i = 0; i < stringArray2.length; i++) {
			System.out.println(stringArray2[i]);
		}
		int[] array2 = new int[] { 1, 2, 4, 6, 8 };
		increase1(array2);
		
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		JFrame defaultWindow = new JFrame("Results");
		defaultWindow.setSize(width, height);
		defaultWindow.setVisible(true);
		
		
	}

	public void paint(Graphics g)
    {
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	    
        g.drawString("Happy, happy, joy, joy", width + 2, height + 5);
    }
	
	public static int add1(int int1, int int2) {
		System.out.println(int1 + int2);
		return int1 + int2;
	}

	public static boolean odd1(int int1) {
		if (int1 % 2 == 1) {
			System.out.println("True: Odd");
			return true;
		} else {
			System.out.println("False: Even");
			return false;
		}
	}

	public static int max1(int[] array1) {
		int maximumInt = 0;
		for (int i = 0; i < array1.length; i++) {
			if (maximumInt < array1[i]) {
				maximumInt = array1[i];
			}
		}
		System.out.println(maximumInt);
		return maximumInt;
	}

	public static String[] names1() {
		String[] stringArray1 = new String[] { "Drew", "Alex", "Vic", "June",
				"Robert" };

		return stringArray1;
	}

	public static int[] increase1(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			array2[i]++;
			System.out.println(array2[i]);
		}
		return array2;
	}
	
	public static int[] increase2(int int1, int int2, int int3) {
		int[] array3 = new int[] {int1, int2, int3};
		for (int i = 0; i < array3.length; i++) {
			array3[i]++;
		}
		return array3;
	}
	
	public static int[] newIncrease(int[] testArray) {
		for (int i = 0; i < testArray.length; i++) {
			testArray[i]++;
		}
		return testArray;
	}
}
