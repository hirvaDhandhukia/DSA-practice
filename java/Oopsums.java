class Student {

    String name;
    int age;

    public void printInfo() {
        // System.out.println("Student name: " + this.name);
        // System.out.println("Student age: " + this.age);

        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }

    public Student(String name, int age) {
        System.out.println("Constructor called");
        this.name = name;
        this.age = age;
    }
}

public class Oopsums {
    
    public static void main(String[] args) {
        // object of the class
        Student s1 = new Student("Hirva", 21);
        // s1.name = "Hirva";
        // s1.age = 21;

        s1.printInfo();
    }
}
