package Assigmentofarrays;
// WAP to see whether in array is palindrome number is there 
import java.util.*;
public class palindromenumberimarray {
    public static boolean isPalindrome(int[] arr) {
        for (int num : arr) {
            int original = num;
            int reverse = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10 + lastDigit;
                num /= 10; // Remove the last digit
            }
            if (original == reverse) {
                return true; // If any number in the array is a palindrome, return true
            }
        }
        return false; // None of the numbers in the array are palindromes
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a size of array ");
      int n = sc.nextInt();
      int arr [] =new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      if (isPalindrome(arr)) {
        System.out.println("yes in array thier is palinfrome number ");
        } else {
        System.out.println("no in array thier is palinfrome number");
        }
        }
        } 

