// Check whether the given number is prime or not 

import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Num : ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        in.close();
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while(c <= Math.sqrt(n)){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
