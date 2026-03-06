// 2D Arrays
import java.util.*;
public class Arr6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]arr = new int[3][3];
        System.out.println("Enter elements of 3x3 Matrix");
        for (int i = 0;i<3;i++){
            for (int j = 0;j<3;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Your given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
