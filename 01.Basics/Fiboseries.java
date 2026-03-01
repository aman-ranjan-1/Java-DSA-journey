//Problem : FIND THE Nth TERM OF FIBONACCI SERIES

import java.util.Scanner;
public class Fiboseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of Fibonacci Series:");
        int n = sc.nextInt();
        int a = 0 , b = 1 ,temp;
        int count=2;
        while(count <= n){
            temp = b;  //1 
            b = b + a; 
            a = temp;
            count++;
        }
        System.out.print("The value at "+n);
        System.out.print(" index is "+b);
    }
}
