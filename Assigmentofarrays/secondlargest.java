package Assigmentofarrays;
//Find the second largest element in the given Array in one pass.

import java.util.Scanner;

public class secondlargest {
    public static int secondlargestnumberinarray(int[]arr){
        int max = Integer.MIN_VALUE;
        int scmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                scmax = max;
                max = arr[i];
            }
            if (arr[i]>scmax && arr[i]!=max ) {
                scmax=arr[i];
                
            }
        }
            // if (arr[i]>scmax && arr[i]!=max ) {
            //     scmax = arr[i];
            // }
        
        //     for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]>scmax && arr[i]!=max ) {
        //         scmax = arr[i];
        //     }
        // }
        
        return scmax;
    } 

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+n+" element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
     int ans =   secondlargestnumberinarray(arr);
     System.out.println("the second largest is "+ans);
    }
}
