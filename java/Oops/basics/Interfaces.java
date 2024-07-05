package Oops.basics;

public class Interfaces implements Car, Person {
    public static void main(String[] args) {
        Interfaces bumbleBee = new Interfaces();
        bumbleBee.start();
    }

    @Override
    public void start() {
        System.out.println("my car is starting");
    }   
    @Override
    public void walk() {
        System.out.println("my person is walking");
    }
}

// provides true abstraction 
// all fns inside this  are abstract by default
interface Car {
    void start();
}
interface Person {
    void walk();
}