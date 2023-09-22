abstract class Cars {
    public abstract void CarsRev(); // abstract method
    public void Engine() {
        System.out.println("Engine");
    }
}

class SportsCar extends Cars {
    // body of CarsRev is here
    public void CarsRev() {
        System.out.println("Cars Rev");
    }
}

public class Abstract {
    public static void main(String[] args) {

        SportsCar myObj = new SportsCar();
        myObj.CarsRev();
        myObj.Engine();
    }
}
