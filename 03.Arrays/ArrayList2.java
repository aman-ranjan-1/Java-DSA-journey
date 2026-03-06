// Remove all even numbers from an ArrayList

import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < n ; i++) {
            int num = in.nextInt();
            list.add(num);
        }
        System.out.println("Given ArrayList is "+list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println("Arraylist after removing even numbers "+list);
    }
}
