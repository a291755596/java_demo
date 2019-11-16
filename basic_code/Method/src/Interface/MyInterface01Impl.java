package Interface;

public class MyInterface01Impl implements MyInterface01 {
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了接口里面的默认方法");
    }
}
