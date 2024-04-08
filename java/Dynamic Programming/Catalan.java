//  nth catalan number
public class Catalan {

    // dynamic programming function to find nth catalan number


    // recursive function to find nth catalan number
    int catalanRec(int n) {

        int res = 0;

        if(n<= 1) {
            return 1;
        }
        for(int i=0; i<n; i++) {
            res += catalanRec(i) * catalanRec(n - i - 1); 
        }
        return res;

    }

    public static void main(String[] args) {

        Catalan sc = new Catalan();
        for (int i=0; i<10; i++) {
            System.out.print(sc.catalanRec(i) + " ");
        }
    }
}
