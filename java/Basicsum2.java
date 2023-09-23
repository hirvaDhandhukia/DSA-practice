import java.util.Scanner;

public class Basicsum2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int limit = sc.nextInt();
            int i=1;
            while(true) {
                if(i == 4) {
                    i++;
                    continue;
                }

                System.out.print(i + " ");
                i++;
                if(i > limit) break;
            }
        }
    }
}
