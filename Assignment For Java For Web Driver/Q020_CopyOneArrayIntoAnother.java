package Assignment;

public class Q020_CopyOneArrayIntoAnother {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Create a new array with the same length
        int[] copiedArray = new int[originalArray.length];
        
        // Copy elements from originalArray to copiedArray
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        // Print both arrays
        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nCopied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
