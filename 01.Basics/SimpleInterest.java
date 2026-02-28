//Problem : Find Simple Interest by using Command line Arguments 

public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t,SI;
        p=Float.parseFloat(args[0]);
        r=Float.parseFloat(args[1]);
        t=Float.parseFloat(args[2]);
        SI=(p*r*t)/100;
        System.out.println("Simple Interest of given input is:"+SI);
    }
}
