import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47};

    for (int i = 0 ; i < primes.length; i++) {

      assertEquals("Test prime numbers " + primes[i], true, PrimeCheck.isPrime(primes[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25};

    for( int i = 0 ; i < nonPrimes.length; i++){

      assertEquals("Test non-prime numbers" + nonPrimes[i], false , PrimeCheck.isPrime(nonPrimes[i]));
      
    }
  }
}
