package Inherit;

<<<<<<< HEAD
//抽象类所在的方法必须是抽象方法，所以也要在这个方法后面添加abstract
public abstract class Employee {
    public Employee(){
        System.out.println("父类的抽象方法");
=======
public class Employee {
    //父类的构造函数
    public Employee(int num){
        System.out.println("这是父类的构造函数");
        System.out.println(num);
    }


    //覆盖重写的应用
    public void call(){
        System.out.println("打电话");
>>>>>>> eea9c15a04ee79ecec7e8cce098de3df90526772
    }


    //抽象方法，在public后面添加上abstract，并且省略大括号即为抽象类
    public abstract void eat();

    //一般方法
    public void method(){
        System.out.println("这是一个方法");
    }

}
