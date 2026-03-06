// Transpose of a matrix(Square Matrix)
import java.util.*;
public class Arr7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        int [][]arr = new int[n][n];
        // input elements of array
        System.out.println("Enter "+n*n+" elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //print original given array
        System.out.println("Your given array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //transpose
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        // print transpose of array --
        System.out.println("Transposed array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
