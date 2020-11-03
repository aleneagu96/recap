package algorithms;

public class RecursionUtils {

    //Write a recursive function that computes the power of a number

    public static int computePower(int number, int power) {
        if (power != 0) {
            return (number * computePower(number, power - 1));
        } else
            return 1;
    }

    // Write a recursive function that calculates factorial of a number

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else
            return number * factorial(number - 1);
    }
}
