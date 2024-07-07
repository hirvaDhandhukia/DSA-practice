package Multithreading;

// thread synchronization in java
public class ThreadSync {
    public static void main(String[] args) {
        // the main `user thread`
        System.out.println("main is starting");

        // Thread thread1 = new Thread1("first");
        // thread1.setDaemon(false);
        // thread1.start();

        // implementation of runnable interface through lambda
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<5; i++) {
                System.out.println("inside " + Thread.currentThread() + ", " + i);
            }
        }, "second");
        thread2.start();

        System.out.println("main is exiting");
    }
}
