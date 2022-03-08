import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge1Test {

    @Test
    void reverseString_given_an_empty_string() {
        String given = "";
        String shouldReturn = "";

        String result = Challenge1.reverseString(given);

        assertEquals(result, shouldReturn);
    }

    @Test
    void reverseString_given_an_string_number() {
        String given = "1234567890";
        String shouldReturn = "0987654321";

        String result = Challenge1.reverseString(given);

        assertEquals(result, shouldReturn);
    }

    @Test
    void reverseString_given_an_string_starting_with_space() {
        String given = " start with an space";
        String shouldReturn = "ecaps na htiw trats ";

        String result = Challenge1.reverseString(given);

        assertEquals(result, shouldReturn);
    }

    @Test
    void reverseString_given_an_string_with_a_break_line() {
        String given = "line 1\nline 2";
        String shouldReturn = "2 enil\n1 enil";

        String result = Challenge1.reverseString(given);

        assertEquals(result, shouldReturn);
    }
}