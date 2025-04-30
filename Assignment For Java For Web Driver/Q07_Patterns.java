package Assignment;

public class Q07_Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        pattern1(5);
        
        System.out.println("\nPattern 2:");
        pattern2(5);
        
        System.out.println("\nPattern 3:");
        pattern3(4);
        
        System.out.println("\nPattern 4:");
        pattern4(3);
    }

    // Pattern 1
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    // Pattern 2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j % 2 == 0) ? "1" : "0");
            }
            System.out.println();
        }
    }
    
    // Pattern 3
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
    // Pattern 4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}