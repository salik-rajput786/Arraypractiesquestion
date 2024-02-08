package Assigmentofarrays;
/*Given an array of integers, change the value of all odd indexed elements to its second multiple and
increment all even indexed values by 10.*/
import java.util.Scanner;

public class changethevalueinarray {
     public static void  change(int arr[]){ 
        
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                arr[i]+=10;
            }
            else{
                 arr[i]*=2 ;
                
            }
        
        }
    }
    public static void input(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
               change(arr);
               input(arr);

    }
}

