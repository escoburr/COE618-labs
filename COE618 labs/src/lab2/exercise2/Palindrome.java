package lab2.exercise2;

public class Palindrome {

	public static boolean IsPalindrome(String str) {
		// REQUIRES:
		// MODIFIES:
		// EFFECTS:throws NullPointerException if str == nul, if str is palindrome returns true if not returns false
		int maxIndex = str.length() - 1;
		if (str.length() <= 1)
			return true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(maxIndex - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "deed";
		String str2 = "abdef";
		String str3 = "ac";
		String str4 = "a";
		String str5 = null;
		if (IsPalindrome(str1))
			System.out.println("Is a palindrome");
		else
			System.out.println("Is not a palindrome");
	}
}
