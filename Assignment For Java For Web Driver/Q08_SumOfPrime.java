package Assignment;

public class Q08_SumOfPrime {
    public static void main(String[] args) {
        int count = 0, num = 2, sum = 0;
        
        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
