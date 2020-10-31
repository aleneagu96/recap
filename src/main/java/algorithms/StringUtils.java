package algorithms;

public class StringUtils {

    // check if two String are anagrams
    // s1 ="mare";
    // s2 ="rame";
    //TODO: 1. implement using frequency vectors
    //a. check if the two strings have the same lenght
    //b. check if the first letter of the first string is equal to each of the second
    //TODO: 2. implement using two frequency arrays
    //TODO: 3. implement using one frequency array
    //using ASCII code for the frequency array

    public boolean areAnagramStrings(String word1, String word2) {
    return false;
    }


    // check if the Strings are circular permuted
    //TODO: 1. implement using for or frequency array;
    //TODO: 2. implement using only String methods

    // using String methods
    public static boolean areCircularPermutedStrings(String firstWord, String secondWord) {
        // firstWord = "mare";
        // secondWord = "rema";
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        for (int i = 0; i < firstWord.length(); i++) {
            if(!(firstWord.substring(0,1).equals(secondWord.substring(2,3)))){
                return false;
            }
        }
        return true;
    }

    // using frequency array

}
