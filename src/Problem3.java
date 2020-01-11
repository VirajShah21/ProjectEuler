import Euler.Primality;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Viraj Shah
 *
 */
public class Problem3 {
	public static void main(String[] args) {
		int[] factors = Primality.primeFactors(600851475143L);

		System.out.printf("Answer: %d\n", factors[factors.length - 1]);
	}
}
