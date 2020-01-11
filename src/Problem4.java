import Euler.Palindrome;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Viraj Shah
 *
 */
public class Problem4 {
	public static void main(String[] args) {
		int c;
		int largest = 0;
		for (int a = 999; a > 99; a--) {
			for (int b = 999; b > 99; b--) {
				c = a * b;
				if (Palindrome.isPalindrome(c) && c > largest) {
					largest = c;
					System.out.printf("Found: %d\n", c);
				}
			}
		}
		System.out.printf("Answer: %d\n", largest);
	}
}
