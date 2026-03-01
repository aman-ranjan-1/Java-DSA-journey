//Problem : Area of circle from given input

import java.util.*;

public class Area1 {
    public static void main(String[] args) {
        Scanner ac = new Scanner (System.in);
        float radius , Area;
        radius = ac.nextFloat();
        Area = 3.14f * radius * radius ;
        System.out.println("Area of the circle is "+Area);
        ac.close();
    }
}
