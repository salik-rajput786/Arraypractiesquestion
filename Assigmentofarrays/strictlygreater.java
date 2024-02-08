package Assigmentofarrays;
//Count the number of elements strictly greater than x.
import java.util.Scanner;

import array.sortedarray;

public class strictlygreater {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("enter a number ");
        int x = sc.nextInt();
        strictly(arr, x);
        
    }

    public static void input(int[] arr) {
  for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
  }
  System.out.println();
    }

    public static void strictly(int[] arr, int x) {
       int  count =0;
       System.out.println("the number of elements strictly greater than" +x+ "is");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
                
                System.out.print(arr[i]+" ");
            }
           // System.out.println();
        }
        System.out.println();
         System.out.println(count);
    }
}
