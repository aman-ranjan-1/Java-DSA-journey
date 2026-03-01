// Problem : Find the largest number from the given 3 numbers

import java.util.*;

public class Largestnum {
    public static void main(String[] args) {
        int a ,b,c;
        Scanner ac = new Scanner (System.in);
        System.out.println("Enter Three numbers : ");
        a = ac.nextInt();
        b = ac.nextInt();
        c = ac.nextInt();
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.println("Largest number is "+max);
        // int max;
        // if (a>b && a>c){
        //     max = a;
        // }
        // else if(b > c && b > a){
        //     max = b;
        // }
        // else{
        //     max = c;
        // }
        int max = Math.max(c,Math.max(a,b));
        System.out.println("Largest number is : " +max);
        ac.close();
    }
}
