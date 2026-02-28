// Problem:Find Area of circle (take input from command line arguments)
public class Area {
    public static void main(String[] args) {
        float radius,area;
        radius=Float.parseFloat(args[0]);
        area=3.14f*radius*radius;
        System.out.println("Area="+area);
    }
}
