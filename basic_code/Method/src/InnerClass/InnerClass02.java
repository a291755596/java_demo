package InnerClass;

public class InnerClass02 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.method();

    }
}
