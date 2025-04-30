package Assignment;

import java.util.Arrays;

public class Q021_ReverseIntegerArrayValues {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Reverse the array by swapping elements from start and end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
