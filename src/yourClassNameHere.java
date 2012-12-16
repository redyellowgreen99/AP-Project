
public class yourClassNameHere {
	public static void main(String[] args) {
		System.out.println(yourClassNameHere.capital1("your text here"));
	}
	
	public static String capital1(String stringLower) {
		String stringUpper = stringLower.toUpperCase();
		System.out.println(stringUpper);
		return stringUpper;
	}
	
	public String backwards1(String string) {
		char[] stringAsArray = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = stringAsArray.length - 1; i >= 0; i--) {
			sb.append(stringAsArray[i]);
		}
		return sb.toString();
	}
}
