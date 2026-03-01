//Problem : Area of circle from given input

import java.util.*;

public class Area1 {
    public static void main(String[] args) {
        float rad,area;
        Scanner ac = new Scanner (System.in);
        System.out.println("Enter radius : ");
        rad = ac.nextFloat();
        area = 3.14f * rad * rad ;
        System.out.println("Area of the circle is "+area);
        ac.close();
    }
}
