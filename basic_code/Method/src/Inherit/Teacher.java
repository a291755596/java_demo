package Inherit;


public class Teacher extends Employee {
<<<<<<< HEAD

    public Teacher(){
        System.out.println("子类方法的构造函数");
=======
    public Teacher() {
        //可以通过super(参数)来调用父类的有参构造方法
        super(10);
        System.out.println("这是子类的构造函数");
    }

    //新手机添加了新的功能，重写父类的方法
    @Override
    public void show(){
        super.show();
        System.out.println("显示归属地");
        System.out.println("显示号码");
>>>>>>> eea9c15a04ee79ecec7e8cce098de3df90526772
    }

    @Override
    public void eat() {
        System.out.println("父类抽象类下面的抽象方法必须要覆盖重写");
    }
}
