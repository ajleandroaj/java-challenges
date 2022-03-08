import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Challenge3Test {

    @Test
    void getSingleInstance() {
        Challenge3 instance1 = Challenge3.getSingleInstance();
        Challenge3 instance2 = Challenge3.getSingleInstance();

        assertEquals(instance1, instance2);
    }
}