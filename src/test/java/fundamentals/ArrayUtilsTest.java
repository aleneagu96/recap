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

        boolean e1Result = ArrayUtils.checkIfArrayIsPalindrome(e1);

        //then

        Assertions.assertTrue(e1Result);
        // or
        Assertions.assertTrue(ArrayUtils.checkIfArrayIsPalindrome(e1));
        Assertions.assertFalse(ArrayUtils.checkIfArrayIsPalindrome(e2));
        Assertions.assertTrue(ArrayUtils.checkIfArrayIsPalindrome(e3));

    }

    @Test
    public void findMissingNumberTest() {
        // given
        int[] a1 = {1, 2, 4, 5};
        int maxNumber = 5;

        // when && then
        Assertions.assertEquals(3, ArrayUtils.findMissingNumber(a1, maxNumber));
        Assertions.assertEquals(3, ArrayUtils.findMissingNumberUsingMath(a1, maxNumber));
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all tests");
    }
}
