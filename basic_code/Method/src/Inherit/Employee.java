package Inherit;

public class Employee {
    //覆盖重写的应用
    public void call(){
        System.out.println("打电话");
    }

    public void send(){
        System.out.println("发短信");
    }

    //这是父类的方法
    public void show(){
        System.out.println("显示头像");
    }
}
