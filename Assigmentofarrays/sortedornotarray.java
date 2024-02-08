package Assigmentofarrays;

import java.util.Scanner;

//Check if the given array is sorted or not
public class sortedornotarray {
    public static boolean sorted(int arr[]) {
        boolean cheeck = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                cheeck = false;
                break;
            }
        }
        return cheeck;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the given array is sorted " + sorted(arr));

    }
}
