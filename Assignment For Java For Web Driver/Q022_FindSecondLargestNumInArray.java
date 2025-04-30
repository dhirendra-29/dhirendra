package Assignment;

import java.util.Scanner;

public class Q022_FindSecondLargestNumInArray {
    public static void main(String[] args) {
        // Create a scanner to input array size and elements
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Create an array to store the elements
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call the function to find the second largest number
        int result = findSecondLargest(arr);
        
        if (result == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest number in the array is: " + result);
        }
        
        // Close the scanner
        sc.close();
    }

	private static int findSecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
