package Inherit;


public class Teacher extends Employee {

    public Teacher(){
        System.out.println("子类方法的构造函数");
    }

    @Override
    public void eat() {
        System.out.println("父类抽象类下面的抽象方法必须要覆盖重写");
    }
}
