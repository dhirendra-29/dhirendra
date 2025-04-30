package Assignment;

import java.util.ArrayList;

public class Q017_IterateAllElementsInArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        // Iterate through the ArrayList using a for-each loop
        System.out.println("Iterating through ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }
        
    }
}
