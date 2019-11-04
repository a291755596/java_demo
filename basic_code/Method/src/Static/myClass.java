package Static;

//静态方法只能访问静态成员变量，不能访成员变量；

/*
    静态代码块格式为
    public class{
        static{
            静态代码块的内容
        }
    }

    特点：当第一次来带本类的时候，静态代码块执行唯一一次
    静态内容总是优先于非静态，所以静态代码块会比构造函数要先执行，用来对一次性的成员变量进行赋值


*/
public class myClass {
    int num;
    static int staticnum;

    public myClass() {
        System.out.println("这是类的构造函数");
    }


    static {
        System.out.println("进入了静态代码块");
    }



    public void method(){
        System.out.println("这是一个成员方法");
    }

    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }

}
