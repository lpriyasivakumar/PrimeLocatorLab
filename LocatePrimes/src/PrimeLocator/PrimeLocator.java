package PrimeLocator;

import java.util.ArrayList;

public class PrimeLocator {
	private static final int MAX_NUM = 1000;
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	static{
		populatePrimesTo1000();
		//System.out.println(primes);
	}
	
	public static int locate(int index) {			
		return primes.get(index - 1);
	}

	private static void populatePrimesTo1000() {
		for (int num = 2; num < MAX_NUM; num++) {
			if (num < 4){
				primes.add(num);
			}
			else if (num % 2 == 0 || num % 3 == 0){
				continue;
			}
			else if (trialDivision(num)){
				primes.add(num);
			}
		}
	}

	private static boolean trialDivision(int num) {
		int sqrt = (int) Math.sqrt(num);		
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
