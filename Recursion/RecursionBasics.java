package Recursion;

import java.util.Arrays;

public class RecursionBasics {

    public static int fib(int n) {
        return 0;
    }

    public static int factorial(int n) {
        return 0;
    }

    public static void printRowOfCharacters(char c, int n) {
        if (n < 1) return;
        System.out.print(c);
        printRowOfCharacters(c, n - 1);
    }

    public static void printPortionOfArrayBackwards(Object[] arr, int startIndex, int endIndex) {
        System.out.print(arr[endIndex]);
        if (endIndex - startIndex > 0) {
            printPortionOfArrayBackwards(arr, startIndex, endIndex - 1);
        }
    }

    public static void printPortionOfArray(Object[] arr, int startIndex, int endIndex) {
        System.out.print(arr[startIndex]);
        if (endIndex - startIndex > 0) {
            printPortionOfArray(arr, startIndex + 1, endIndex);
        }
    }

    public static boolean isPalindrome(String word) {
        System.out.println(word);
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static int addInts(int[] arr) {
        if (arr.length == 1) return arr[0];
        return arr[1] + addInts(Arrays.copyOf(arr, arr.length - 1));
    }

//    public static int getSmallestInt(int[] arr, int left, int right) {
//
//        if (left == right) {
//            return arr[left];
//        }
//
//        int i1 = getSmallestInt(arr, left, (right - left)/2);
//        int i2 = getSmallestInt(arr,(right - left)/2 + 1, right);
//
//        return Math.max(i1, i2);
//    }


}
