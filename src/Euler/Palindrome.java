package Euler;

/**
 * Palindrome class
 * 
 * @author Viraj Shah
 *
 */
public class Palindrome {
	/**
	 * Checks if a long is a palindrome
	 * 
	 * @param n The number to check
	 * @return True if <b>n</b> is a palindrome
	 */
	public static boolean isPalindrome(long n) {
		String s = n + "";

		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;

		return true;
	}
}
