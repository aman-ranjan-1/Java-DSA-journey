// FIRST PROGRAM ON STRING
// Learning What is String 

import java.util.*;

public class Str1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = new String();
        str = in.nextLine(); // Entered a string 
        System.out.println("Entered String = "+str); // Print the string
        int len = str.length(); // count the length of string
        System.out.println("Length of the string is "+len);
        // space delimeter
        String[] words = str.split(" ");
        System.out.println("String Breaking --");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("String Joining -- ");
        String sentence = String.join(" ",words);
        System.out.println(sentence);
        // Uppercase 

        String Upper = sentence.toUpperCase();
        System.out.println("Uppercase = "+Upper);

        // Lowercase

        String Lower = sentence.toLowerCase();
        System.out.println("Lowercase = "+Lower);

        //indexof
        System.out.println("Enter something to search");
        String search = in.next();
        int index_sen = sentence.indexOf(search);
        System.out.println("Found at index : "+index_sen);
    }
}
