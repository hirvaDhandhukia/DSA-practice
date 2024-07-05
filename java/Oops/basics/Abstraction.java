package Oops.basics;

public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}

// actual things
class Audi extends Car {
    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}
class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

// just a concept, can't make an object out of this
abstract class Car {
    int price;
    abstract void start();

    void breaks() {
        System.out.println("car is breaking");
    }
}
