package Assignment;

public class Q010_AverageofArray {
    public static void main(String[] args) {
        // Step 1: Initialize the array with sample numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Step 3: Compute the average
        double average = (double) sum / numbers.length;

        // Step 4: Display the result
        System.out.println("The average is: " + average);
    }
}

