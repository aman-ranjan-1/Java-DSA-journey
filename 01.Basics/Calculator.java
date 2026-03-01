//Problem : Create a Calculator (for performing + , - , * , / , % ,)
//To stop the program press X or x
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char oper;
        float ans = 0;
        while(true){
            System.out.print("Enter a operator : ");
            oper = sc.next().trim().charAt(0);
            if( oper == 'X'|| oper == 'x'){
                System.out.println("Program Ended !!");
                break;
            }
            System.out.print("Enter Two Numbers: ");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println();
            if (oper == '+'|| oper == '-' || oper == '*' || oper == '/'|| oper == '%'){
                if ( oper == '+'){
                    ans = num1 + num2;
                }
                if ( oper == '-'){
                    ans = num1 - num2;
                }
                if ( oper == '*'){
                    ans = num1 * num2;
                }
                if ( oper == '/'){
                    if(num2 > 0){
                        ans = num1 / num2;
                    }
                }
                if ( oper == '%'){
                    if(num2 > 0){
                        ans = num1 % num2;
                    }
                }
            }
            else{
                System.out.println("InVaLiD InPuT !!");
            }
            System.out.println("Answer is "+ans);
        }
    }
}
