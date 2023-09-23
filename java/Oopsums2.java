class Cars {
    String name;
    String model;
    public void printInfo() {
        System.out.println(name);
        System.out.println(model);
    }

    Cars() {}
    Cars(Cars c2) {
        this.name = c2.name;
        this.model = c2.model;
    }
}

public class Oopsums2 {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.name = "bmw";
        c1.model = "m5";

        Cars c2 = new Cars(c1);
        c2.printInfo();
    }
}
