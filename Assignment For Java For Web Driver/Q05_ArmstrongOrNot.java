package Assignment;

import java.util.Scanner;

public class Q05_ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int originalNumber = number, sum = 0, temp, digit;
        
        while (number > 0) {
            digit = number % 10;
            sum += (digit * digit * digit);
            number /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
