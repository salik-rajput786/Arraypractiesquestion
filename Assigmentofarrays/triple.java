package Assigmentofarrays;
//Count the number of triplets whose sum is equal to the given value x.

import java.util.Scanner;

public class triple {
    public static int  sum(int arr[] ,int x){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if (arr[i]+arr[j]+arr[j2]==x) {
                        sum++;
                    }
                }
            }
        }
        return sum;
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
        System.out.println("enter a traget to find in array ");
        int v = sc.nextInt();
        int ans = sum(arr, v);
        System.out.println(ans);
    }
}
