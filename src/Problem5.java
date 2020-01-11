
public class Problem5 {
	public static void main(String[] args) {
		int n = 20 * 19;

		for (n = 20 * 19 * 17 * 13 * 11 * 7 * 3; !caseMatches(n); n++) {
		}
		System.out.printf("Answer: %d\n", n);
	}

	static boolean caseMatches(int n) {
		for (int i = 2; i <= 20; i++)
			if (n % i != 0)
				return false;
		return true;
	}
}
