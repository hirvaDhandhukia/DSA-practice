public class Constructors {
    int x=2;
    String carName;
    String model;

    // constructor of the class
    public Constructors(String name, String givenModel) {
        x=7;

        carName = name;
        model = givenModel;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors("BMW", "M5");
        // System.out.println(myObj.x);
        System.out.println(myObj.carName + " " + myObj.model);
    }

}
