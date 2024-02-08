package Assigmentofarrays;
//Find the minimum value out of all elements in the array.
import java.util.Scanner;

public class minarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minarraynumber(arr);
        System.out.println(" the minimum is " + ans);
    }

    public static int minarraynumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
