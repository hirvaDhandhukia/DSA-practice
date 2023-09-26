// provides a way to use the primitive data types as objects
public class Wrapperclass {
    public static void main(String[] args) {

        Integer myInt = 5;
        Double myDouble = 5.36;
        Character myChar = 'A';

        // System.out.println(myInt);
        // System.out.println(myDouble);
        // System.out.println(myChar);

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString() method => used to convert wrapper objects to strings.
        Integer i = 100;
        String myString = i.toString();
        System.out.println(myString.length());

    }
}
