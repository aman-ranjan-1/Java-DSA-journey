// To sum up all the elements of a given array

import java.util.*;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of elements for your array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter "+n+" elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is "+Arrays.toString(arr));
        for (int i = 0 ; i < arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of given array is "+sum);
    }
}
