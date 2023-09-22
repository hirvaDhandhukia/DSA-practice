class Vehicle {
    protected String brand="ford";
    public void honk() {
        System.out.println("Honk Honk");
    }
}

class Inheritance extends Vehicle {
    // attribute
    private String modelName = "Mustang"; 
    public static void main(String[] args) {

        // created an object
        Inheritance myObj = new Inheritance();
        myObj.honk();
        System.out.println(myObj.brand + " " + myObj.modelName);
    }       
}
