import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge2Test {

    @Test
    void filterByPrimeNumbers_given_an_empty_array() {
        Integer[] given = new Integer[0];
        Integer[] shouldReturn = new Integer[0];

        Integer[] result = Challenge2.filterByPrimeNumbers(given);

        assertArrayEquals(result, shouldReturn);
    }

    @Test
    void filterByPrimeNumbers_given_all_prime() {
        Integer[] given = new Integer[]{5, 3, 7};
        Integer[] shouldReturn = new Integer[]{5, 3, 7};

        Integer[] result = Challenge2.filterByPrimeNumbers(given);

        assertArrayEquals(result, shouldReturn);
    }

    @Test
    void filterByPrimeNumbers_given_all_not_prime() {
        Integer[] given = new Integer[]{8, 6, 10};
        Integer[] shouldReturn = new Integer[0];

        Integer[] result = Challenge2.filterByPrimeNumbers(given);

        assertArrayEquals(result, shouldReturn);
    }

    @Test
    void filterByPrimeNumbers_given_mixed_types() {
        Integer[] given = new Integer[]{2, 8, 1, 6, 7, 10};
        Integer[] shouldReturn = new Integer[]{2, 7};

        Integer[] result = Challenge2.filterByPrimeNumbers(given);

        assertArrayEquals(result, shouldReturn);
    }

    @Test
    void isPrime() {
        Integer[] someOfPrimeNumbers = new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        Integer[] someOfNotPrimeNumbers = new Integer[]{0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20};

        for (int shouldBePrime : someOfPrimeNumbers) {
            assertTrue(Challenge2.isPrime(shouldBePrime), String.format("The number \"%d\" should be prime", shouldBePrime));
        }

        for (int shouldNotBePrime : someOfNotPrimeNumbers) {
            assertFalse(Challenge2.isPrime(shouldNotBePrime), String.format("The number \"%d\" shouldn't be prime", shouldNotBePrime));
        }
    }
}