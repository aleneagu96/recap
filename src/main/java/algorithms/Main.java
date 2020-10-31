package algorithms;

public class Main {
    public static void main(String[] args) {


        int[] e1 = {1, 2, 5, 5, 2, 1};
        int[] e2 = {2, 1, 1, 3, 2, 1};
        int[] e3 = {5, 4, 3, 4, 5};
        Integer[] myArray = {1, 7, 9, 2, 6, 4, 1, 2};
        int length = 6;
        int[] test = {1, 7, 9, 2, 6, 4};
        String letterAppearedExerciseString = "aasfeaft";
        String namedLetter = "f";
        String paragraph = "Today we coded for about four hours";
        StringBuffer word = new StringBuffer("String");
        int index = 2;
        int a = 5;
        int b = 8;



        System.out.println("Palindrome exercise");
        System.out.println(ArrayUtils.isPalindrome(e1));
        System.out.println(ArrayUtils.isPalindrome(e2));
        System.out.println(ArrayUtils.isPalindrome(e3));

        System.out.println("");

        System.out.println(ArrayUtils.isPalindromen(e1));
        System.out.println(ArrayUtils.isPalindromen(e2));
        System.out.println(ArrayUtils.isPalindromen(e3));

        System.out.println("");

        System.out.println("Inverse array exercise:");
        System.out.println(ArrayUtils.inverse(myArray));
        ArrayUtils.reverseArray(e2,length);
        System.out.println(" " + " ");
        ArrayUtils.revArray(e2);
        System.out.println(" ");

        System.out.println("");
        System.out.println("Sorting array exercise:");
        System.out.println(ArrayUtils.sort(myArray));
        System.out.println(ArrayUtils.sortTheArray(test));

        System.out.println("");
        System.out.println("Is prime exercise:");
        System.out.println(ArrayUtils.isPrime(3));
        System.out.println(ArrayUtils.isPrime(-1));
        System.out.println(ArrayUtils.isPrime(12));
        System.out.println(ArrayUtils.isPrime(0));

//        System.out.println("");
//        System.out.println("Remove duplicates exercise:");
//        System.out.println(ArrayUtils.removeDuplicates(myArray));

        System.out.println("");
        System.out.println("Aparition exercise:");
        System.out.println("The letter " + namedLetter + " appears " +(ArrayUtils.aparitions(letterAppearedExerciseString, namedLetter) +" times"));

        System.out.println("");
        System.out.println("Vowel exercise:");
        System.out.println("The paragraph cotains " + ArrayUtils.vowelCounter(paragraph) + " vowels");

        System.out.println("");
        System.out.println("Remove a char exercise:");
        System.out.println("Initial word is: " + word + " and the resulted word is: " + ArrayUtils.eliminateCharacter(word,index));

// Interchanging exercise
        System.out.println(" ");
        System.out.println("Interchanging variables");
        System.out.println("Before interchanging " + a + " and " + b);
        ArrayUtils.interchangeVariables(a, b);
        System.out.println(" ");


    }
}
