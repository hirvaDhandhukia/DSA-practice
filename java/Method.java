public class Method {
    // functn
    static void myMethod(String fname) {
        System.out.println(fname+"Codes");
    }

    static int propMethod(int x) {
        return x+1;
    }

    public static void main(String[] args) {
        myMethod("Hirva");
        System.out.println(propMethod(5));
    }
}
