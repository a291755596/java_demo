package InnerClass;

public class OuterMethod {
    public void Outer(){
        class InnerMethod{  //局部内部类
            int num = 10;

            public void methodInner(){
                System.out.println("外部类方法的内部类");
                System.out.println(num);
            }
        }

        InnerMethod inner = new InnerMethod();

        inner.methodInner();
    }
}
