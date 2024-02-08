package Assigmentofarrays;
//If an array arr contains n elements, then check if the given array is a palindrome or not .
import java.util.Scanner;
public class palindromenumberinarray1 {
    // public static boolean isPalindrome(int[] arr) {
    // for (int num : arr) {
    // int original = num;
    // int reverse = 0;
    // while (num > 0) {
    // int lastDigit = num % 10;
    // reverse = reverse * 10 + lastDigit;
    // num /= 10; // Remove the last digit
    // }
    // if (original == reverse) {
    // return true; // If any number in the array is a palindrome, return true
    // }
    // }
    // return false; // None of the numbers in the array are palindromes
    // }

    // public static boolean IsPalindrome(int[] arr){

    // int temp = 0;
    // int res = 0, nakli = 0;
    // int reverse = 0, rem;
    // for (int num : arr) {

    // temp = temp * 10 + num;
    // res = temp;
    // }

    // // Loop to find reverse number
    // while (temp > 0)
    // {
    // rem = temp % 10;
    // reverse = reverse * 10 + rem;
    // temp /= 10;
    // nakli = reverse;
    // }

    // // Palindrome if num and reverse are equal
    // if (res == nakli)
    // return true;

    // return false;
    // }
    public static boolean IsPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // int[] arr = {121};
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = IsPalindrome(arr);
        System.out.println(ans);
    }
}
