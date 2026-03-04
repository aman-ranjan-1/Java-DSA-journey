// Subarrays of Array

import java.util.Arrays;
import java.util.Scanner;

public class Arr5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("Given Array is "+Arrays.toString(arr));

        System.out.println("-- Subarrays of Array --");
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                for (int element = si; element <= ei; element++) {
                    System.out.print(arr[element]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}