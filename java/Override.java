class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() { 
        System.out.println("Child");

    }
}

public class Override {
    public static void main(String[] args) {

        // creating objects
        Parent obj1 = new Parent();
        obj1.show();

        Child obj2 = new Child();
        obj2.show();
    }
}