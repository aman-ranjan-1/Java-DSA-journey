//To Reverse elements of array
import java.util.*;
public class Arr4 {
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
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array is "+Arrays.toString(arr));
    }
}
