package Euler;

import java.util.ArrayList;

/**
 * Helpful Fibonacci methods
 * 
 * @author Viraj Shah
 *
 */
public class Fibonacci {
	public static int[] sequenceTill(int max) {
		ArrayList<Integer> nums = new ArrayList<>();
		int[] out;

		int a = 1;
		int b = 1;
		int c = 0;
		nums.add(1);
		nums.add(1);

		while (c < max) {
			c = a + b;
			nums.add(c);
			a = b;
			b = c;
		}

		out = new int[nums.size()];

		for (int i = 0; i < out.length; i++)
			out[i] = nums.get(i);

		return out;
	}

	public static int[] firstNTerms(int n) {
		int[] out = new int[n];

		int a = 1;
		int b = 1;
		int c = 0;

		out[0] = 1;
		out[1] = 1;

		for (int i = 2; i < n; i++) {
			c = a + b;
			out[i] = c;
			a = b;
			b = c;
		}

		return out;
	}
}
