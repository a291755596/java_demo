package Interface;

public interface MyInterface03 {
    //接口中的常量
    //1、接口中的常量必须赋值
    //2、接口中的常量可以省略public static final三个关键字
    //3、接口中的常量不可改变
    public static final int NUM = 10;





    //如果两个默认方法中有相同的代码不想暴露出去
    //可以通过添加private的方式来封装

    public default void method(){
        System.out.println("这是一个默认方法");
        method02();
    }

    public default void method01(){
        System.out.println("这是一个默认的方法02");
        method02();
    }

    public static void methodStatic01(){
        System.out.println("这是一个静态的方法");
        methodStatic();
    }

    public static void methodStatic02(){
        System.out.println("这是第二个静态方法");
        methodStatic();
    }

    private static void methodStatic(){
        System.out.println("静态方法的公用方法哈哈哈哈");
    }

    private void method02(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }


}
