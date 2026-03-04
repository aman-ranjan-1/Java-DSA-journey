
import java.util.Arrays;

// Length of the array , declaration and initialization of array

public class Arr1 {
    public static void main(String[] args) {
        //declaration and initialization of the array
        int[] arr={1,2,3,4,5,6,7};
        
        //Print First element
        System.out.println("Value at index 0 is "+arr[0]);
        // Print Length of the array // 7
        System.out.println("Lenth of the array is "+arr.length);

        //print all the elements of the array
        System.out.println("Array is ");
        System.out.println(Arrays.toString(arr));// converts the elements to string , pre defined in java language

        // Another old method to print elements of array via loop 

        System.out.println("Elements of the given array is");
        for (int i = 0; i < arr.length; i++) {//traversing each element 
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
}
