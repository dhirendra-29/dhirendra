package Assignment;

// Abstract class Parent
abstract class Parent {
    // Abstract method message
    public abstract void message();
}

// First subclass of Parent
class FirstSubclass extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

// Second subclass of Parent
class SecondSubclass extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}

// Main class to test the implementation
public class Q023_MethodWithSameName {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Parent first = new FirstSubclass();
        Parent second = new SecondSubclass();
        
        // Calling the message method for each subclass
        first.message();   // Output: This is first subclass
        second.message();  // Output: This is second subclass
    }
}
