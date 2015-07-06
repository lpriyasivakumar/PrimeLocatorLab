package PrimeLocator;

import java.util.ArrayList;

public class PrimeLocator {
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static int locate(int index) {
		primes = populatePrimes(index - 1);
		return primes.get(index - 1);
	}

	private static ArrayList<Integer> populatePrimes(int index) {
		while (primes.size() <= index) {
			for (int num = 2; num < 1000; num++) {
				if (num < 4)
					primes.add(num);
				else if (num % 2 == 0 || num % 3 == 0)
					continue;
				else if (trialDivision(num))
					primes.add(num);
			}
		}
		return primes;
	}

	private static boolean trialDivision(int num) {
		int sqrt = (int) Math.sqrt(num);
		boolean isPrime = true;
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

}
