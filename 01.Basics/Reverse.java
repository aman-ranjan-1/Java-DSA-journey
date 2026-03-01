//Problem : Reverse a given number 
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,ans=0;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        while(num!=0){
            int rem = num%10;
            ans = (ans*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of the num is "+ans);
    }
}
