//定义一个学生类，包含属性（是什么）和行为（能做什么）
//属性：年龄，姓名
//行为：吃饭，睡觉，学习


package Class;

public class Student {
    //成员变量：属性
    String name;
    int age;


    //成员方法：吃饭，睡觉，学习
    public void eat(){
        System.out.println("这是一个吃饭的方法");
    }

    public void sleep(){
        System.out.println("这是一个睡觉方法");
    }

    public void study(){
        System.out.println("这是一个学习方法");
    }

}
