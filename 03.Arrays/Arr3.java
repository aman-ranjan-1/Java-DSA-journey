// To print the maximum element of the array take input from user.

import java.util.*;
public class Arr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value of the given array is "+max);
    }
}
