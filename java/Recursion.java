public class Recursion {
    public static void main(String[] args) {
        int answer = sum(10);
        System.out.println(answer);

        int ansInBetn = sumInBetn(5, 10);
        System.out.println(ansInBetn);
    }

    // functn sum 
    public static int sum(int k) {
        if(k>0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }

    public static int sumInBetn(int start, int end) {
        if(end > start) {
            return end + sumInBetn(start, end - 1);
        } else {
            return end;
        }
    }
}
