import java.lang.Math;
import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {

	int max = -1;
	
	// Get a single int argument from the user
	try {
	    max = Integer.parseInt(args[0]);
	} catch (Exception ex) {
	    // Ending error messages with prepositions?
	    // An outrage up with which I will not put!
	    System.out.println("Enter a single (32-bit) integer to calculate primes up to");
	}

	// Neither 0 nor 1 are prime, let's just quit
	// Or maybe they put in negative?  Either way, just quit.
	
	if (max < 2) {
	    return;
	}

	// Otherwise, create an array and assume that all numbers
	// except 0 and 1 are prime
	
	boolean[] primes  = new boolean[max + 1];

	Arrays.fill(primes, true);
	primes[0] = false;
	primes[1] = false;

	// The actual Sieve execution
	
	// The highest value that we need to search for is the
	// square of the max number.
	
	int limit = (int) Math.ceil(Math.sqrt(max));
	
	for (int j = 2; j < limit; j++) {

	    // If this value is prime, mark all multiples of it
	    // in the array as NOT prime (they are composite because
	    // they have that value as a factor)
	    if (primes[j]) {
		for (int k = j; k * j <= max; k++) {
		    try {
			primes[k * j] = false;
		    } catch (ArrayIndexOutOfBoundsException oobex) {
			// just walked off the edge, it's OK
			// Ignore and continue
			System.out.println("OOBEX - " + oobex.toString());
			System.exit(1);
		    }
		}
	    }
	}

	// Finally, print out any of the remaining values that
	// still have a true value

	for (int j = 0; j <= max; j++) {
	    if (primes[j]) {
		// System.out.println(j + " is a prime!");
	    }
	}
	
    }
}
    
