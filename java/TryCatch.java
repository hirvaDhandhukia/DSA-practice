public class TryCatch {
    public static void main(String[] args) {

        int[] marks = {97, 98, 95};
        try {
            System.out.println(marks[6]);
        } catch(Exception exception) {
            System.out.println("Caught exception in array printing");
        }
        System.out.println("My name is Hirva");
    }
}
