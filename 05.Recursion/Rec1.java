//Understanding Recursion in Java - Print 1 to 10 numbers 

public class Rec1 {
    public static void main(String[] args) {
        // calling a function to print 1 to 10 
        print(1);
    }
    public static void print(int n){
        if (n==10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
