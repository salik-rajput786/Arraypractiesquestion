package Assigmentofarrays;

import java.util.Scanner;

//Find the first non-repeating element in the array .
public class norepeatingarray {
    public static int  repeating(int arr[]){
        for (int i = 0; i < arr.length; i++) {
               for (int j = i+1; j < arr.length; j++) {
                     if (arr[i]==arr[j]) {
                        arr[i]=-1;
                        arr[j] =-1;
                     } 
                     }
               }
               int ans = -1;
               for (int k = 0; k < arr.length; k++) {
                if (arr[k] > 0){
                    ans=arr[k];
           }
         
               }
               return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n +" element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
             int ans = repeating(arr);
             System.out.println(ans);
}
}
