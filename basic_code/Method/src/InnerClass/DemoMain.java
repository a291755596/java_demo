package InnerClass;

public class DemoMain {
    public static void main(String[] args) {
        //一般的实现类使用方法，但是这个实现类的调用仅使用了唯一的一次，所以可以换成匿名内部类
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //impl.method();

        //多态的实现类使用方法 左父右子
        //MyInterface obj = new MyInterfaceImpl();
        //obj.method();

        //使用匿名内部类,匿名内部类在创建对象的时候，只能使用唯一一次
        //要不使用impl实现类，要不写两次匿名内部类
        MyInterface objA = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法aaa");
            }
        };

        objA.method();


        //这种写法是使用了匿名内部类，而且省略了对象名称，也是匿名对象
       new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法bbb");
            }
        }.method();


    }
}
