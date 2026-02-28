//Problem:Swap Two numbers 
//Another Method(Only two Variable)
public class Swapping1 {
    public static void main(String[] args) {
        int a=10,b=99;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
