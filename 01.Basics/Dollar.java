// Input currency in rupees and output in USD
// Note : Current Dollar value might differ 
import java.util.*;
public class Dollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Currency (in rupees) : ");
        float rup,dol=0;
        rup = in.nextFloat();
        dol =( rup * 0.011f);
        System.out.println("Your Currency in dollars $"+dol);
        in.close();
    }
    
}
