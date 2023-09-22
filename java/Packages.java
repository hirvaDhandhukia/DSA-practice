import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        try (Scanner object = new Scanner(System.in)) {
            System.out.println("Enter username ");

            String name = object.nextLine();
            System.out.println("Username is: " + name);
        }
    }
}