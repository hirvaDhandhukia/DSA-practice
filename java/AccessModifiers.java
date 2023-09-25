class Parent {

    // 'final' method cannot be overriden
    // 'static' methods caannot be overriden
    final void m1() {
        System.out.println("m1");
    }
    protected void m2() {
        System.out.println("m2");
    }
}
class Child extends Parent {
    // inherited method m2 is changed from protected to public for class Child
    public void m2() {
        System.out.println("m2 child");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();

        p1.m2();
        c1.m1();
        c1.m2();
    }
}
