package Assigmentofarrays;

import java.util.Scanner;

public class uniqueelementinarray {
    public static int  uniqu(int A[] , int ar_size) {

      // Iterate over every element 
    for (int i = 0; i < ar_size; i++) { 
  
        // Initialize count to 0 
        int count = 0; 
    
        for (int j = 0; j < ar_size; j++) { 
    
          // Count the frequency 
          // of the element 
          if (A[i] == A[j]) { 
            count++; 
          } 
        } 
    
        // if the frequency of the 
        // element is one 
        if (count == 1) { 
          return A[i]; 
        } 
      } 
    
      // if no element exist at most once 
      return -1; 
    } 





    //     for (int i = 0; i < arr.length; i++) {
    //         int count =0;
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[i] == arr[j]) {
    //                count++;
    //             }
    //             if (count==1) {
    //                 return arr[i];
    //             }
    //         }

    //     }
    //     return -1;
    // }

    // public static void input(int []arr){
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println( uniqu(arr,n));
        // input(arr);

    }
}
