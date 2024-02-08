package Assigmentofarrays;
// WAP to find the duplicate elements from the given array of elements.
import java.util.Scanner;

public class duplicatearray {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enterthe size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " element ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
        
    } 
      
     public static int duplicate(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("yes there is dupliate number in array is " +arr[i]);
               }
            }
           
        }
        System.out.println("not found ");
        
        return -1;

     }
    
}