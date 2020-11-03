package fundamentals;

import algorithms.RecursionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionUtilsTest {

    @Test
    public void computePowerTest() {
        // given
        int number = 3;
        int power = 2;

        // when
        int result = RecursionUtils.computePower(number, power);

        // then
        Assertions.assertEquals(9, result);
    }

    @Test
    public void factorialTest() {
        // given
        int number = 5;

        // when & then

        Assertions.assertEquals(120, RecursionUtils.factorial(number));
    }
}

