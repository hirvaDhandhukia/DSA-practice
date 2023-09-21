// the abstract class 
abstract class Modifiers {
    public String fname = "Hirva";
    public int age = 21;
    public abstract void study(); //this is an abstract method 

}

// this is a Subclass 
class Student extends Modifiers {
    public int graduationYear = 2023;
    public void study() {
        // body of the abstract method "study()" is here in the extended class
        System.out.println("Study all day");
    }
}