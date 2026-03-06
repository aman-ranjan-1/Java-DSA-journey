// Operations on ArrayList 
// 1. Add elements to the ArrayList
// 2. Add element to the specific index value.
// 3. Get an element from ArrayList
// 4. Set an element in AssayLIst(Replacing an existing value)
// 5. Remove an element from ArrayList
// 6. Size of an ArrayList
// 7. Clear - Removes all elements of an ArrayList.
// 8. IndexOf given element found first in ArrayList
// 10. LastIndexOf - gives last index of element found.

import java.util.*;
class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("ArrayList is "+list); // OP [10, 20, 30, 40, 50]

        // Add element to the specific index 
        list.add(0,5); // Adds 5 to the index 0
        list.add(2,15); // Adds 15 to the index 2
        System.out.println("List after Insertion "+list);

        // Get an element from arraylist

        int get = list.get(5); // gives the element at index 5
        System.out.println("Element at index 5 : "+get);

        // Set an element in ArrayList
        list.set(5,20); // changes the element of index 5 to 20
        System.out.println("Element at index 5 : "+list.get(5));

        // Remove an Element from ArrayList
        list.remove(6); // removes element at index 6
        System.out.println("List after removal of element at index 6 "+list);

        // Size of an ArrayList
        System.out.println("Size of ArrayList is "+list.size());
        
        // IndexOf element
        System.out.println("Index of 20 : "+list.indexOf(20));

        // IndexLastOf
        System.out.println("Last Index Of 20 : "+list.lastIndexOf(20));

        // Clear 
        list.clear();
        System.out.println("Final List : "+list);
    }
}