import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {

        int a=0, b=1, c;
        if(n==0) 
            return a;

        for(int i=2; i<=n; i++) {
            c = a+b;
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fib(num));

        sc.close();

    }
}
