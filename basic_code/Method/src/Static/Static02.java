package Static;


public class Static02 {
    public static void main(String[] args) {
        //对于非静态方法，需要先创建对象，然后使用对象名.成员方法名进行调用
        myClass obj = new myClass();
        obj.method();

        //对于静态方法，可以通过对象名.成员方法名进行调用，也可以通过类名.成员方法名调用
        obj.staticMethod();     //不推荐这么写
        myClass.staticMethod(); //推荐写法


        //对于本类中的静态方法，可以省略类名称
        Static02.myMethod();
        myMethod();

    }

    public static void myMethod(){
        System.out.println("这是主函数中的方法");
    }
}
