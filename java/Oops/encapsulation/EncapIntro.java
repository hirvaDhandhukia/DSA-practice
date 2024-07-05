package Oops.encapsulation;

public class EncapIntro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(24);

        System.out.println(l1.getPrice());

    }

    // public method - accessible throughout
    // private method
    // private void doWork() {
    //     System.out.println("working working!");
    // }
}

class Laptop {
    int ram;
    private int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        // is the user admin?
        boolean isAdmin = false;
        if(!isAdmin) {
            System.out.println("Not allowed to access");
        } else {
            this.price = price;
        }
    }
    
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
}