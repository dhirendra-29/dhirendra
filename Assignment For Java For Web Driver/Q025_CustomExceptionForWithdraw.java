package Assignment;

// Step 1: Define the custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Step 2: Define the BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize account with a balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw the amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double deficit = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance. You need more " + deficit + " Rs to perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Transaction successful! New balance: " + balance + " Rs.");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
}

// Step 3: Main class to test the functionality
public class Q025_CustomExceptionForWithdraw {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of 2000 Rs
        BankAccount account = new BankAccount(2000);

        // Withdraw amount greater than the current balance
        double withdrawAmount = 2500;
        System.out.println("Account balance is: " + account.getBalance() + " Rs.");
        System.out.println("Enter withdraw amount: " + withdrawAmount + " Rs.");

        try {
            // Try withdrawing
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            // Handle exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}
