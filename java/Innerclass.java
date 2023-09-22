class OuterClass {
    int x = 2;

    class InnerClass {
        public int innerMethod() {
            return x;
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {

        // object 
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        System.out.println(innerObj.innerMethod());
    }
}
