import java.util.Scanner;
// user has this many rs, what stationary can they buy?
// pen = 10, notebook = 40

public class Basicsum {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { 
            int cash = sc.nextInt();
            if(cash < 10) {
                System.out.println("You don't have enough cash");
            } else if(cash > 10 && cash < 50) {
                System.out.println("You can get 1 thing");
            } else {
                System.out.println("Can get both");
            }
        }
    }
}
