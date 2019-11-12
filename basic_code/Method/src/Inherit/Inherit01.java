package Inherit;
<<<<<<< HEAD
=======
/*
    定义父类的格式:
    public class 父类名称{
        //.....
    }


    定义子类的格式：
    public class 子类名称 extend 父类名称{
        //....
    }

*/
>>>>>>> eea9c15a04ee79ecec7e8cce098de3df90526772

public class Inherit01 {
    public static void main(String[] args) {
        //创建子类对象使用抽象类
        Teacher teacher = new Teacher();
<<<<<<< HEAD
        teacher.eat();
=======
        //teacher.method();

        //Assisant assisant = new Assisant();
        //assisant.method();


        //创建一个父类对象
        //Employee employee = new Employee();
        //employee.numfu      //父类对象中，只能使用父类对象的成员方法

        //子类使用父类的成员变量
        //System.out.println(teacher.numfu);
        //System.out.println(teacher.numzi);

        //1、通过成员方法来调用：当父类和子类使用相同成员变量的时候，等号左边是谁就使用谁
        //父类和子类中都有num变量，打印出来的是子类的变量
        //System.out.println(teacher.num);

        //2、通过成员方法来调动：
        //teacher.methodson();    //100
        //teacher.methodfather(); //200


        //当子类的方法和父类的方法重名时，谁创建的对象就使用谁
        //父类和子类中都有method方法，但是teacher是从子类创建的对象，所以使用子类的方法
        //teacher.method();

        teacher.send();
        teacher.call();
        teacher.show();
>>>>>>> eea9c15a04ee79ecec7e8cce098de3df90526772
    }

}
