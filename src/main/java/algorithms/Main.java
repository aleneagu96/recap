package algorithms;

public class Main {
    public static void main(String[] args) {


        int[] e1 = {1, 2, 5, 5, 2, 1};
        int[] e2 = {2, 1, 1, 3, 2, 1};
        int[] e3 = {5, 4, 3, 4, 5};
        Integer[] myArray = {1, 7, 9, 2, 6, 4, 1, 2};
        int[] test = {1, 7, 9, 2, 6, 4};
        int[] arr = {1, 2, 3, 5, 6};


        String letterAppearedExerciseString = "aasfeaft";
        String namedLetter = "f";
        String paragraph = "Today we coded for about four hours";
        StringBuffer word = new StringBuffer("String");

        int index = 2;
        int length = 6;
        int a = 5;
        int b = 8;
        int maxNumber = 6;


//  Check if an array is palindrome
        System.out.println("Palindrome exercise");
        System.out.println(ArrayUtils.isPalindrome(e1));
        System.out.println(ArrayUtils.isPalindrome(e2));
        System.out.println(ArrayUtils.isPalindrome(e3));

        System.out.println("");

        System.out.println(ArrayUtils.checkIfArrayIsPalindrome(e1));
        System.out.println(ArrayUtils.checkIfArrayIsPalindrome(e2));
        System.out.println(ArrayUtils.checkIfArrayIsPalindrome(e3));

//  Reverse an array exercise

        System.out.println("");
        System.out.println("Inverse array exercise:");
        System.out.println(ArrayUtils.inverse(myArray));
        ArrayUtils.reverseArray(e2,length);
        System.out.println(" " + " ");
        ArrayUtils.revArray(e2);
        System.out.println(" ");


//  Sorting an array exercise

        System.out.println("");
        System.out.println("Sorting array exercise:");
        System.out.println(ArrayUtils.sort(myArray));
        System.out.println(ArrayUtils.sortTheArray(test));

//  Check if the number is prime exercise

        System.out.println("");
        System.out.println("Is prime exercise:");
        System.out.println(ArrayUtils.isPrime(3));
        System.out.println(ArrayUtils.isPrime(-1));
        System.out.println(ArrayUtils.isPrime(12));
        System.out.println(ArrayUtils.isPrime(0));

//  Remove duplicates exercise

        System.out.println("");
        System.out.println("Remove duplicates exercise:");
        ArrayUtils.removeDuplicates(e1);

//  Apparitions exercise

        System.out.println("");
        System.out.println("Aparition exercise:");
        System.out.println("The letter " + namedLetter + " appears " +(ArrayUtils.aparitions(letterAppearedExerciseString, namedLetter) +" times"));

//  Vowel exercise

        System.out.println("");
        System.out.println("Vowel exercise:");
        System.out.println("The paragraph cotains " + ArrayUtils.vowelCounter(paragraph) + " vowels");

//  Remove a char exercise
        System.out.println("");
        System.out.println("Remove a char exercise:");
        System.out.println("Initial word is: " + word + " and the resulted word is: " + ArrayUtils.eliminateCharacter(word,index));

//  Interchanging exercise
        System.out.println(" ");
        System.out.println("Interchanging variables");
        System.out.println("Before interchanging " + a + " and " + b);
        ArrayUtils.interchangeVariables(a, b);


//  Find the missing number exercise
        System.out.println(" ");
        System.out.println("Find the number exercise");
        int number = ArrayUtils.findMissingNumber(arr,maxNumber);
        System.out.println("Using frequency array, the missing number from the given array is: " + number);
        int missingNumber = ArrayUtils.findMissingNumberUsingMath(arr,maxNumber);
        System.out.println("Using math, the missing number from the given array is: " + missingNumber);
    }
}
