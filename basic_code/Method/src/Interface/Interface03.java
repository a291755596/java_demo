package Interface;

public class Interface03 {
    public static void main(String[] args) {
        MyInterface02Impl impl = new MyInterface02Impl();

        //静态接口的错误调用
        //不能通过接口实现类的对象来调用接口当中的静态方法
        //impl.method()

        //静态接口的正确调用
        //直接通过接口名称来调用接口中的静态方法
        MyInterface02.method();

    }
}
