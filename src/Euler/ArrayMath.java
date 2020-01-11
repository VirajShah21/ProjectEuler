package Euler;

import java.util.ArrayList;

/**
 * Performs mathematical operations on Arrays and ArrayLists
 * 
 * @author Viraj Shah
 *
 */
public class ArrayMath {
	/**
	 * Multiply all the elements in an ArrayList
	 * 
	 * @param ints The ArrayList of Integer objects
	 * @return The product of all elements in <i>ints</i>
	 */
	public static long multiply(ArrayList<Integer> ints) {
		long prod = 1;

		for (int i : ints)
			prod *= i;

		return prod;
	}
}
