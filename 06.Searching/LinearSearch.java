// Perform Linear Search Operation in an ArrayList
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ArrayList<Integer> Alist = new ArrayList<>();
        System.out.println("Enter size of the Arraylist");
        int n = in.nextInt();
        System.out.println("Enter elements of ArrayList");
        for (int i = 0; i < n; i++) {
            int element = in.nextInt();
            Alist.add(element);
        }
        System.out.println("Your Given ArrayList is "+Alist);
        System.out.println("Enter Element to search ");
        int key = in.nextInt();
        Boolean index = null;
        for (int i = 0; i < Alist.size(); i++) {
            if (Alist.get(i)==key){
                index = true;
                System.out.println("Element found at index : "+i);
                break;
            }
            else{
                index = false;
            }
        }
        if (index == false){
            System.out.println("Element is not present.");
        }
    }
}
