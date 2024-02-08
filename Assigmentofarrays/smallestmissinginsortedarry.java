package Assigmentofarrays;

//WAP to find the smallest missing positive element in the sorted Array.
import java.util.Scanner;

public class smallestmissinginsortedarry {
    public static int[] sortArrays(int arr[]) {
        boolean swapped = true;
        // int conut =0;
        while (swapped) {
            swapped = false;
            int j = 0;
            while (j < arr.length - 1) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping the elements.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Set swapped to true to continue the outer loop
                    swapped = true;
                }
                j++;
            }
        }
        return arr;
    }

    public static int findmissingnumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 8, 1, 6, 7 ,4,10};
        int n = arr.length;
        sortArrays(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int ans = findmissingnumber(arr);
        System.out.println("missing number number is " + ans);

    }

}
