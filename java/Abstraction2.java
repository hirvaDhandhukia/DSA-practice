abstract class Shape {
    String color;

    // abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have constructor
    public Shape(String color) {
        System.out.println("Shape constructor");
        this.color = color;
    }

    // concrete methods
    public String getColor() { return color; }
}

class Circle extends Shape {
    double radius;

    // constructor
    public Circle(String color, double radius) {
        // 'super' is a reference variable that is used to refer parent class objects.
        super(color);
        System.out.println("Cirle constructor");
        this.radius = radius;
    }

    // body of abstract methods
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is: " + area();
    }
} 
class Rectangle extends Shape{
    double length;
    double height;

    // constructor
    public Rectangle(String color, double length, double height) {
        super(color);
        System.out.println("Rectangle constructor");
        this.length = length;
        this.height = height;
    }
    double area() {
        return length*height;
    }
    public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is: " + area();
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", 2.2);
        Shape s2 = new Rectangle("blue", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
