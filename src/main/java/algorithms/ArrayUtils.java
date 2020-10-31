package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {

//    check if array is palindrome
//    palindrome: int[] n = {1, 2, 5, 5, 2, 1};
//    i:n[0],n[1],n[2],n[3],n[4],n[5]
//    j:n[5],n[4],n[3],n[2],n[1],n[0]

    public static boolean isPalindrome(int[] arr) {
        boolean isPalindrome = false;
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    public static boolean checkIfArrayIsPalindrome(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) { // can be also used : n[i] != n[j]
                return false;
            }
        }
        return true;
    }

//    Scrieti un program care sa inverseze elementele intr-un array de tip int (array dat ca parametru)
//    Ex: [1, 34, 89, 2, 7]  - inversare array => [7, 2, 89, 34, 1]

    // i-0 = 1-> 7
    // i-1 = 34-> 2
    // i-2 = 89-> 89
    // i-3 = 2-> 34
    // i-4 = 7-> 1

    // using collections
    public static List<Integer> inverse(Integer[] myArray) {
        List<Integer> list = Arrays.asList(myArray);
        Collections.reverse(list);
        return list;
    }

    // using an additional array
    public static void reverseArray(int[] a, int arrLength) {
        int[] reversedArray = new int[arrLength];
        int j = arrLength;
        for (int i = 0; i < arrLength; i++, j--) {
            reversedArray[j - 1] = a[i];
        }

        System.out.println("Reversed elements are: \n");
        for (int k = 0; k < arrLength; k++) {
            System.out.print(reversedArray[k] + " ");

        }
    }

    //using no additional array

    public static void revArray(int[] n) {
        for (int i = 0, j = n.length - 1; i <= j; i++, j--) {
            int a = n[i];
            n[i] = n[j];
            n[j] = a;
        }
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + " ");
        }
    }

    // return type: array

    public static int[] reversingArray(int[] n) {
        for (int i = 0, j = n.length - 1; i <= j; i++, j--) {
            int a = n[i];
            n[i] = n[j];
            n[j] = a;
        }
        return n;
    }

//    Scrieti un program care sorteaza un array de elemente int (array dat ca parametru)
//Ex: bubble sort, selection sort, [2, 9, 3, 10] - sortare array => [2,3, 9, 10]

    public static List<Integer> sort(Integer[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            List<Integer> arrayToList = Arrays.asList(myArray);
            Collections.sort(arrayToList);
        }
        return Arrays.asList(myArray);
    }

    public static String sortTheArray(int[] array) {
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }

        }
        return Arrays.toString(array);
    }

//    Scrieti un program care verifica daca un numar e prim. (nr dat ca parametru)

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

//    Scrieti un program care elemina dintr-un array elementele duplicate
//    Ex: [2, 4, 7, 2, 8, 2] - elimina duplicate => [2,4,7,8]

    public static void removeDuplicates(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < array.length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    counter++;
                }
            }
        }
        for (int i = 0; i < array.length - counter; i++) {
            System.out.print(array[i] + " ");
        }
    }


//    Scrieti un program care determina numarul de aparitii unei litere date ca parametru

    public static int aparitions(String word, String x) {
        int apparition = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).matches(x)) {
                apparition++;
            }
        }
        return apparition;
    }

//    Scrieti un program care determina numarul de vocale dintr-un string ( => array de caractere). (String-ul dat ca parametru)
//Ex: “afara ploua” => 6 vocale (a, a, a, o, u, a)

    public static int vowelCounter(String words) {
        int numberOfVowels = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u') {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }

//    Scrieti un program care elimina un caracter (dat ca parametru) dintr-un string.

    public static StringBuffer eliminateCharacter(StringBuffer word, int index) {
        StringBuffer resultString = word.deleteCharAt(index);
        return resultString;
    }

    //    Interschimbrea a 2 numere fara variabila auxiliara
    public static void interchangeVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After interchanging " + a + " and " + b);
    }


    // From a list of numbers from 1 to 1000, where a single number is missing, how can you determine which one is
    // missing while having O(n) complexity
    // vector de vrecventa
    //TODO: apply conditions for edge case scenarios( maxNumber = 0- throws exception, there are more than one missing number)

    public static int findMissingNumber(int[] numbers, int maxNumber) {
        int[] f = new int[maxNumber + 1];
        for (int j = 0; j < f.length; j++) {  // every elem in f is 0
            f[j] = 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            f[numbers[i]]++;
        }
        for (int k = 1; k < f.length; k++) {
            if (f[k] == 0) {
                return k;
            }
        }
        return 0;
    }

    // fara vector de frecventa
    // sum  = n(n+1)/2
    // note that this method works in the context of numbers that go from 1 to n

    public static int findMissingNumberUsingMath(int[] arr, int maxNumber) {
        int sum = 0;
        int expectedSum = maxNumber * (maxNumber + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // better choice than sum = sum + arr[i];
        }
        return expectedSum - sum;
    }

}

