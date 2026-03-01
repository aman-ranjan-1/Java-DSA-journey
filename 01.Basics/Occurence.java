
import java.util.Scanner;

//Problem : Count a specific digit from a given number

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , value ;
        System.out.println("Enter any number : ");
        num = sc.nextInt();
        System.out.print("Enter a digit to count (counting Occurence)");
        value = sc.nextInt();
        int count = 0;
        while (num!=0){
            int rem = num%10;
            if(rem==value){
                count = count+1;
            }
            num = num/10;
        }
        System.out.println("No. of times digit occuring :"+count);
    }
}
