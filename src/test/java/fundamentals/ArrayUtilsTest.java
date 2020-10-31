package fundamentals;

import algorithms.ArrayUtils;
import org.junit.jupiter.api.*;

public class ArrayUtilsTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before all tests");
    }

    @Test
    public void isPalindromenTest() {
        // given
        int[] e1 = {1, 2, 5, 5, 2, 1};
        int[] e2 = {2, 1, 1, 3, 2, 1};
        int[] e3 = {5, 4, 3, 4, 5};

        //when

        boolean e1Result = ArrayUtils.isPalindromen(e1);

        //then

        Assertions.assertTrue(e1Result);
        // or
        Assertions.assertTrue(ArrayUtils.isPalindromen(e1));
        Assertions.assertFalse(ArrayUtils.isPalindromen(e2));
        Assertions.assertTrue(ArrayUtils.isPalindromen(e3));

    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all tests");
    }
}
