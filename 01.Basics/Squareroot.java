//Problem:Find square root of the number (use command line arguments)

public class Squareroot {
    public static void main(String[] args) {
        double num,sqr;
        num=Float.parseFloat(args[0]);
        sqr=Math.sqrt(num);
        System.out.println("Square Root of the number is "+sqr);
    }
}
