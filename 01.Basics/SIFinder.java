// Problem : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class SIFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float p,r,t,SI=0;
        System.out.print("Enter Principal Amount : ");
        p = in.nextFloat();
        System.out.print("Enter Rate of Interest : ");
        r = in.nextFloat();
        System.out.print("Enter Time Period : ");
        t = in.nextFloat();     
        
        SI = (p*r*t)/100;
        System.out.print("Simple Interest is "+SI);
    }
}
