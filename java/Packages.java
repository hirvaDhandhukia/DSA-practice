import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        // system.in => takes input
        // system.out => gives output 
        try (Scanner object = new Scanner(System.in)) {
            System.out.println("Enter username ");

            // object.nextLine() allows to input a value in a new variable
            String name = object.nextLine();
            System.out.println("Username is: " + name);

            // int age = object.nextInt();
            // float age = object.nextFloat();
        }
    }
}