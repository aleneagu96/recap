package fundamentals;

import algorithms.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void areCircularPermutedStringsTest() {

        // given
        String s1 = "mare";
        String s2 = "rema";
        String s3 = "rexa";

        // then
        //Assertions.assertTrue(StringUtils.areCircularPermutedStrings(s1,s2)); //true
        //Assertions.assertTrue(StringUtils.areCircularPermutedStrings(s1,s3)); //false
    }
}
