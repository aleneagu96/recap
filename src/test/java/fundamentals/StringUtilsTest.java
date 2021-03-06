package fundamentals;

import algorithms.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringUtilsTest {

    @Test
    public void areCircularPermutedStringsTest() {

        // given
        String s1 = "mare";
        String s2 = "rema";
        String s3 = "rexa";

        // when & then
        Assertions.assertTrue(StringUtils.areCircularPermutedStrings(s1, s2));
        Assertions.assertFalse(StringUtils.areCircularPermutedStrings(s1, s3));
    }

    @Test
    public void isCircularyPermutedTest() {
        // given
        String s1 = "mare";
        String s2 = "rema";
        String s3 = "rexa";

        // when

        boolean circular = StringUtils.isCircularyPermuted(s2, s1);
        boolean circular2 = StringUtils.isCircularyPermuted(s1, s3);

        //then

        Assertions.assertTrue(circular);
        Assertions.assertFalse(circular2);

    }

    @Test
    public void areAnagramsUsingTwoFrequencyArraysTest() {
        //given
        String s1 = "mare";
        String s2 = "rame";
        String s3 = "rate";

        // when

        boolean isAnagram1 = StringUtils.areAnagramsUsingTwoFrequencyArrays(s1,s2);
        boolean isAnagram2 = StringUtils.areAnagramsUsingTwoFrequencyArrays(s2,s3);

        //then

        Assertions.assertTrue(isAnagram1);
        Assertions.assertFalse(isAnagram2);

    }

    @Test
    public void areAnagramStringsUsingOneFrequencyArrayTest() {
        // given
        String s1 = "mare";
        String s2 = "rema";
        String s3 = "rexa";
        //when & then

        Assertions.assertTrue(StringUtils.areAnagramStringsUsingOneFrequencyArray(s1, s2));
        Assertions.assertFalse(StringUtils.areAnagramStringsUsingOneFrequencyArray(s1, s3));

    }

    @ParameterizedTest
    @CsvSource({"mare,rema, true", "mare,rexa, false"})
    public void checkIfPermutedTest(String s1, String s2, boolean arePermuted) {
        Assertions.assertEquals(arePermuted, StringUtils.isCircularyPermuted(s1,s2));
    }

}



