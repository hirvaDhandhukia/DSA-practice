class Cars {
    public void CarsRev() {
        System.out.println("Cars rev");
    }
}

class Supra extends Cars {
    public void CarsRev() {
        System.out.println("Supra revs");
    }
}

class Bmw extends Cars {
    public void CarsRev() {
        System.out.println("BMW revs");
    }
}

class Polymorphism {
    public static void main(String[] args) {

        // new object for car
        Cars newCar = new Cars();
        Supra newSupra = new Supra();
        Bmw newBmw = new Bmw();

        newCar.CarsRev();
        newSupra.CarsRev();
        newBmw.CarsRev();
    }
}