public class SecondObject {

    String fname = "Hirva";
    String lname = "Codes";
    int age = 21;

    // static method
    static void firstMethod() {
        System.out.println("printed firstMethod");
    }
    // public method
    public void secondMethod() {
        System.out.println("printed secondMethod");
    }

    public static void main(String[] args) {
        // Objects secondObj = new Objects(); // new object of the class (file-> Objects.java)
        // System.out.println(secondObj.y); 

        SecondObject object = new SecondObject();
        System.out.println(object.fname + " " + object.lname + " is " + object.age + " years old.");

        firstMethod();
        SecondObject publicObject = new SecondObject();
        publicObject.secondMethod();
    } 
}
