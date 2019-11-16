package Interface;

public interface MyInterface01 {
    //接口中实现抽象方法
    public abstract void methodA();

    //如果这个时候在接口中添加了一个抽象方法，那么所有的实现类都必须要覆盖重写
    //所以可以使用接口的默认方法 default

    public default void methodB(){
        System.out.println("这是接口的默认方法，可以继承过去的");
    }

}
