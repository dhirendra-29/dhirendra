package Assignment;

import java.util.Scanner;

public class Q01_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three numbers as input
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        // Finding the greatest number using simple if-else
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }

        sc.close();
    }
}
