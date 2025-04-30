package Assignment;

import java.util.Arrays;

public class Q019_RemoveThirdElementFromArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Remove 3rd element (index 2)
        arr = removeElement(arr, 2);
        
        // Print modified array
        System.out.println("Array after removing 3rd element: " + Arrays.toString(arr));
    }

    // Method to remove element at a specified index
    public static int[] removeElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
            return arr; // Return the array as is if index is invalid
        }
        
        int[] newArr = new int[arr.length - 1]; // New array with one less element
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
