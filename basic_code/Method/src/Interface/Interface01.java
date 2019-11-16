package Interface;

public class Interface01 {
    public static void main(String[] args) {

        //这是错误写法，不能直接new接口对象使用
        //MyInterface inter = new MyInterface();

        //要创建实现类的方式使用
        MyInterfaceImpl impl = new MyInterfaceImpl();

        impl.methodA();
        impl.methodB();
        impl.methodC();

}
}
