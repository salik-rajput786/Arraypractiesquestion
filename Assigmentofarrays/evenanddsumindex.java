package Assigmentofarrays;

import java.util.Scanner;

//Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
public class evenanddsumindex {
    public static void evenanddsum(int arr[]){
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.println("the sum of even number at indices " +even);
        System.out.println("the sum of odd number at indices "  +odd);
        int sub = even-odd;
        System.out.println("the differcence betwwen of even number and odd number  at indices " +sub);
        
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
        evenanddsum(arr);

    }
}
