
public class App {

	public static void main(String[] args) {
		
		// Practice session. Create a method that passes a string and
		// the string is printed out in reverse
		// For example: "world" - "dlrow"
		
		String string = "education";
		System.out.println(reverseWord(string));
	}

	public static String reverseWord(String string) {
		StringBuilder strFromUser = new StringBuilder();
		// System.out.println(string.charAt(3));
		
		for (int ctr = string.length(); ctr > 0; ctr--) {
			strFromUser.append(string.charAt(ctr-1));
		}
		return strFromUser.toString();
	}
}
