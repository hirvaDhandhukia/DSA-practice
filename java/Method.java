public class Method {
    // functn
    static void myMethod(String fname) {
        System.out.println(fname+"Codes");
    }

    static int propMethod(int x) {
        return x+1;
    }

    // method overloading 
    static int add(int x, int y) {
        return x+y;
    }
    static double add(double x, double y) {
        return x+y;
    }

    public static void main(String[] args) {
        myMethod("Hirva");
        System.out.println(propMethod(5));

        int num1 = add(6, 4); // 10
        double num2 = add(9.6, 0.4); // 10.0
        System.out.println(num1 + " " + num2);
    }
}
