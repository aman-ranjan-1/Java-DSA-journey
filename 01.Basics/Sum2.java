//Problem : Add two number (use of scanner class)

import java.util.*;

public class Sum2 {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1:");
        a = sc.nextInt();
        System.out.println("Enter num2:");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Added number is : "+sum);
        sc.close();
    }
}
