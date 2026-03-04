// Problem : Factorial of 1 to n numbers
import java.util.*;
public class Productn{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // taking input n from user
        System.out.println("Enter n :");
        int n = in.nextInt();
        //creating loop for iterating 
        int product = 1;
        for (int i = 1;i<=n;i++){
            product = product * i;
            System.out.println(product);
        }
    }
}
