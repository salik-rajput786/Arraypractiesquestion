package Assigmentofarrays;
//Calculate the product of all the elements in the given array.
import java.util.Scanner;

public class productofarray {
    public static void product(int arr[]){
        int pro =1;
        for (int i = 0; i < arr.length; i++) {
            pro*=arr[i];
        }
        System.out.println("the product of the given array : " +pro);
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
           product(arr);
    }
}
