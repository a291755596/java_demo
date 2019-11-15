package Inherit;

public class Student extends Teacher {
    //孙子类
    @Override
    public void run() {
        System.out.println("这是孙子类，覆盖重写爷爷类的方法");
    }
}
