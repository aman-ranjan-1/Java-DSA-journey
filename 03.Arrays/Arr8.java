// Problem - Count and print all even and odd numbers
import java.util.*;
public class Arr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Alist = new ArrayList<>();
        System.out.println("Enter no. of elements ");
        int n = in.nextInt();
        System.out.println("Enter "+n+" elements ");
        for (int i = 0; i < n ; i++) {
            int element = in.nextInt() ;
            Alist.add(element);
        }
        System.out.println("Your given Arraylist is "+Alist);
        int EvenCount = 0;
        int OddCOunt = 0;
        for (int i = 0; i < Alist.size(); i++) {
            if (Alist.get(i)%2==0){
                EvenCount++;
            }
            else{
                OddCOunt++;
            }
        }
        System.out.println("No of even elements : "+EvenCount+" Odd Elements : "+OddCOunt);
    }
}
