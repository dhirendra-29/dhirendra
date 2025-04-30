package Assignment;

public class Q014_TryCatchBlock {
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Oops! Tried to access an index that doesn't exist.");
	            System.out.println("Exception caught: " + e);
	        } 
	        finally {
	            System.out.println("This block always executes, regardless of exceptions.");
	        }
	    }
}
