package Oops.basics;

public class MainClass {
    public static void main(String[] args) {
        // new object of the class `Person`
        Person p1 = new Person();
        p1.name = "Hirva";
        p1.age = 21; 

        // Person p2 = new Person();
        // p2.name = "Radha";
        // p2.age = 22;
        Person p2 = new Person("Radha", 22);

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        // p2.walk(2000);
        // p2.walk();
        // p1.eat();

        System.out.println(Person.count);
    }
}

// new class
class Person {
    String name;
    int age; 

    // constructor
    static int count;
    public Person() {
        count++;
        System.out.println("Creating an object.");
    }

    // properties initialization
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    // method of the class
    // behaviour
    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }

    // method with args
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }
}