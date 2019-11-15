package Inherit;



//子抽象类下面只覆盖重写了一个抽象类的抽象方法
//这个时候子抽象类必须也是抽象类，在public后面添加上abstract关键字即可
public abstract class Teacher extends Employee {
    //儿子类
    @Override
    public void eat() {
        System.out.println("父类抽象类下面的抽象方法必须要覆盖重写");
    }
}
