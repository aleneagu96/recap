package algorithms;

public class StringUtils {

    // Check if two Strings are anagrams using two frequency arrays
    public static boolean areAnagramsUsingTwoFrequencyArrays(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }

        int[] f1 = new int[256];
        int[] f2 = new int[256];

        for (int i = 0; i < firstString.length(); i++) {
            f1[firstString.charAt(i)]++;
        }
        for (int i = 0; i < secondString.length(); i++) {
            f2[secondString.charAt(i)]++;
        }

        for (int i = 0; i < f1.length; i++) {
            for (int j = 0; j < f2.length; j++) {
                if (f1[i] != f2[i]) {
                    return false;
                }
            }

        }
        return true;
    }

    // check if two String are anagrams using one frequency array
    public static boolean areAnagramStringsUsingOneFrequencyArray(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] f = new int[256];

        for (int i = 0; i < word1.length(); i++) {
            f[word1.charAt(i)]++;
            f[word2.charAt(i)]--;
        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] != 0) {
                return false;
            }

        }
        return true;

    }

    // check if the Strings are circular permuted
    public static boolean areCircularPermutedStrings(String firstWord, String secondWord) {
        int a = 0;
        boolean x = false;
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        for (int i = firstWord.length() - 1; i > 1; i--) {
            boolean exists = secondWord.contains(firstWord.substring(0, i));
            if (exists == true) {
                boolean exists2 = secondWord.contains(firstWord.substring(i));
                if (exists2 == true) {
                    a++;
                    x = true;
                    break;
                }
            }

        }
        return x;
    }


    public static boolean isCircularyPermuted(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s2 += s2;
        return s1.contains(s2);
    }


}
