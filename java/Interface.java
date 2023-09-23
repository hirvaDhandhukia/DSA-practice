interface Animal {
    int eyes = 2;
    void walk();
}
interface Herbivore {

}

class Horse implements Animal, Herbivore {
    // body of walk method is defined here  
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
