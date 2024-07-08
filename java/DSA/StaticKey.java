package DSA;

class ToyCar {
    // static keyword 
    // i.e. shared by all
    static String brandname = "Super car";

    // unique to each
    String color;

    // constructor
    ToyCar(String color) {
        this.color = color;
    }
}

public class StaticKey {
    public static void main(String[] args) {

        ToyCar t1 = new ToyCar("red");
        ToyCar t2 = new ToyCar("blue");

        System.out.println(t1.brandname);
        System.out.println(t1.color);

    }
}
