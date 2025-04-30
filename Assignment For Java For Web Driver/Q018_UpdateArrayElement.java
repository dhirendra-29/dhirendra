package Assignment;

import java.util.Scanner;

public class Q018_UpdateArrayElement {

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Define an array of integers
        int[] arr = {10, 20, 30, 40, 50};
        
        // Display original array
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        // Ask user for the index and new value to update
        System.out.println("\nEnter the index (0 to 4) to update: ");
        int index = scanner.nextInt();
        
        System.out.println("Enter the new value: ");
        int newValue = scanner.nextInt();
        
        // Update the element at the given index
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
            System.out.println("Array after update:");
            
            // Print the updated array
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid index! Please enter an index between 0 and 4.");
        }
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
