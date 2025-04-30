package Assignment;

public class Q015_MultipleBlock {
	    public static void main(String[] args) {
	        try {
	            // Let's intentionally throw some exceptions for fun
	            int[] numbers = {1, 2, 3};
	            System.out.println("Number: " + numbers[5]);  // ArrayIndexOutOfBoundsException

	            int result = 10 / 0;  // ArithmeticException (this won't even be reached!)
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Oops! You tried to access an invalid array index: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Yikes! Division by zero is not allowed: " + e.getMessage());
	        } catch (Exception e) {
	            // Catch-all for anything else that might slip through
	            System.out.println("Something went wrong: " + e.getMessage());
	        }

	        System.out.println("Program keeps going... 😎");
	    }
	}

