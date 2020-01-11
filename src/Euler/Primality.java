package Euler;

import java.util.ArrayList;

/**
 * Class for helping solve Euler composite and prime number problems
 * 
 * @author Viraj Shah
 *
 */
public class Primality {
	/**
	 * Checks if a number is prime
	 * 
	 * @param n The number to check
	 * @return True if <i>n</i> is prime, false otherwise
	 */
	public static boolean isPrime(long n) {
		if (n % 2 == 0)
			return false;

		for (int i = 3; i < Math.sqrt(n); i += 2)
			if (n % i == 0)
				return false;

		return true;
	}

	/**
	 * Checks if a number is composite
	 * 
	 * @param n The number to check
	 * @return True if <i>n</i> is composite, false otherwise
	 */
	public static boolean isComposite(long n) {
		if (n % 2 == 0)
			return true;

		for (int i = 3; i < Math.sqrt(n); i += 2)
			if (n % i == 0)
				return true;
		return false;
	}

	/**
	 * Finds the prime factors of a number
	 * 
	 * @param n The number to find prime factors for
	 * @return An array representing the prime factorization
	 */
	public static int[] primeFactors(long n) {
		ArrayList<Integer> factors = new ArrayList<>();
		long target = n;
		int[] out;

		while (n % 2 == 0) {
			factors.add(2);
			n /= 2;
		}

		for (int i = 3; ArrayMath.multiply(factors) != target; i += 2) {
			if (isPrime(i)) {
				while (n % i == 0) {
					factors.add(i);
					n /= i;
				}
			}
		}

		out = new int[factors.size()];
		for (int i = 0; i < out.length; i++)
			out[i] = factors.get(i);

		return out;

	}
}
