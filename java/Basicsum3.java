// generate a random math integer
// let the user guess it -> Scanner
// if guessed num > or < randomint
// user can stop with -ve input

import java.util.Scanner;

public class Basicsum3 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int random = (int)(Math.random()*100);

        int input;
        do {
            System.out.print("Guess my number(1-100): ");
            input = sn.nextInt();

            if(input == random) {
                System.out.println("Correct guess");
                break;
            } else if(input > random) {
                System.out.println("your number is larger");
            } else if (input < random) {
                System.out.println("your number is smaller");
            } 
        } while(input >= 0);

        System.out.println("The number was: " + random);

        sn.close();
    }
}
