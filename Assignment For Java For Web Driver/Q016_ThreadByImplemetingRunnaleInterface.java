package Assignment;

//This is a simple Java program that creates a thread using Runnable

//Step 1: Create a class that implements Runnable
class MyThread implements Runnable {
 public void run() {
     // This is the code that will run in the new thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             Thread.sleep(1000); // pause for 1 second
         } catch (InterruptedException e) {
             System.out.println("Thread was interrupted.");
         }
     }
 }
}

//Step 2: Main class to run the thread
public class Q016_ThreadByImplemetingRunnaleInterface {
 public static void main(String[] args) {
     // Create an object of MyThread
     MyThread myRunnable = new MyThread();

     // Wrap it in a Thread object
     Thread myThread = new Thread(myRunnable);

     // Start the thread
     myThread.start();

     // Main thread also does something
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main thread: " + i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted.");
         }
     }
 }
}
