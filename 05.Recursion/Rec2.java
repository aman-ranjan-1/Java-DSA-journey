// To add 1 to n numbers 
import java.util.*;
public class Rec2 {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        System.out.println(addition(i,n));
    }
    public static int addition(int a , int m){
        int add = 0;
        add = add + m;
        if(a!=m){
            add = addition(a+1,m) + a;
        }
        return add;
    }
}
