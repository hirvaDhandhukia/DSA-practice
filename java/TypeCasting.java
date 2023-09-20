public class TypeCasting {
    public static void main(String[] args) {
        // widening cast
        int x = 9;
        double y = x;
        System.out.println(x);
        System.out.println(y);

        // narrowing cast (mannual casting)
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        System.out.println(myDouble);

    }
}
