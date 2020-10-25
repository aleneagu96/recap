package algorithms;

public class ArrayUtils {

    //    check if array is palindrome
    public static boolean isPalindrome(int[] arr) {
        boolean isPalindrome = false;
//       palindrome: int[] n = {1,2,5,5,2,1};
//       i: n[0], n[1], n[2], n[3], n[4], n[5]
//       j: n[5], n[4], n[3], n[2], n[1], n[0]
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
}
