import java.util.Arrays;

// implements the Sieve of Eratosthenes algorithm.
// main() prints all primes through some integer n.

public class PrimeSieve {

	public static void main(String[] args) {
		boolean[] result = sieve(100);
		for (int i = 0; i < result.length; i++) {
			if (result[i]) {
				System.out.println(i);
			}
		}
	}

	public static boolean[] sieve(int n) {
    	boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		if (n >= 0) isPrime[0] = false;
		if (n >= 1) isPrime[1] = false;
    
		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p + p; i <= n; i += p) {
					isPrime[i] = false;
					}
				}
    		}	
		return isPrime;
		}
}
