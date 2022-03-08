import java.util.Arrays;

public class Challenge2 {
    static Integer[] filterByPrimeNumbers(Integer[] numbers) {
        return Arrays.stream(numbers).filter(Challenge2::isPrime).toArray(Integer[]::new);
    }

    static boolean isPrime(int number) {
        return number == 2 || number == 3 || (number > 2 && number % 2 != 0 && number % 3 != 0);
    }
}
