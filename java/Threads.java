public class Threads extends Thread {
    public static int amount = 0; 
    public static void main(String[] args) {

        Threads thread = new Threads();  
        // invoking the thread using the start method
        thread.start();
        // System.out.println("code outside of thread");
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run() {
        // System.out.println("this code is running a thread");
        amount++;
    }
}
