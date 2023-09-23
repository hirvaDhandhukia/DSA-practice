abstract class Animal {
    Animal() {
        System.out.println("Created an animal");
    }
    abstract void walk();
    public void eats() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Oopsums4 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}
