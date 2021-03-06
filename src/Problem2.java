import Euler.Fibonacci;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * @author Viraj Shah
 *
 */
public class Problem2 {
	public static void main(String[] args) {
		int[] nums = Fibonacci.sequenceTill((int) 4e6);
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] % 2 == 0)
				sum += nums[i];
		System.out.printf("Answer: %d\n", sum);
	}
}
