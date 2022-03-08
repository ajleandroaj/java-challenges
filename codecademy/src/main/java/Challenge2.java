import java.util.Arrays;

/**
 * Description:
 * 2. Write a Java program to determine whether a number is prime or not
 *    This program should accept an array of numbers. It should iterate through the array of numbers and determine if each is prime or not. Once it’s done processing, it should return only those numbers that are prime in an array.
 */
public class Challenge2 {
    static Integer[] filterByPrimeNumbers(Integer[] numbers) {
        return Arrays.stream(numbers)
                .filter(Challenge2::isPrime)
                .toArray(Integer[]::new);
    }

    static boolean isPrime(int number) {
        return number == 2 || number == 3 || (number > 2 && number % 2 != 0 && number % 3 != 0);
    }
}
