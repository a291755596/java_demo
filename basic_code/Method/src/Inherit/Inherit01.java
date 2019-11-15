package Inherit;

public class Inherit01 {
    public static void main(String[] args) {
        //抽象类是不能通过new来创建对象的，所以下面的方法都是错误方法
        //Employee employee = new Employee();     //  错误写法
        //Teacher teacher = new Teacher();        //  错误写法

        //如果想使用抽象类必须再创建孙子类来进行重写，再通过孙子类进行调用
        Student stu = new Student();
        stu.run();

    }

}
