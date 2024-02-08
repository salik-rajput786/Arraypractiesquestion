package Assigmentofarrays;
//WAP to find the largest three elements in the array.
import java.util.Scanner;

public class largestthreeelementsinarry {
    public static int thridlargestnumberinarray(int[]arr){
        int max = Integer.MIN_VALUE;
        int scmax = Integer.MIN_VALUE;
        int thmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
              
            }
        }
            for (int i = 0; i < arr.length; i++) {
            if (arr[i]>scmax && arr[i]!=max ) {
                scmax = arr[i];
            }
        } 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>thmax && arr[i]!=max && arr[i]!=scmax) {
                thmax = arr[i];
            }
        }

        
        return thmax;
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
     int ans =   thridlargestnumberinarray(arr);
     System.out.println("the third largest is "+ans);
    }
}
