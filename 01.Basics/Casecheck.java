// Problem : Check whether the given character is Uppercase 0r Lowercase

import java.util.*;
public class Casecheck {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char a;
        a = ac.next().trim().charAt(0);
        if (a >=  'a' && a<= 'z'){
            System.out.println("lowercase letter");
        }
        else{
            System.out.println("UPPERCASE LETTER");
        }
    }
}
