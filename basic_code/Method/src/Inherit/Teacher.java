package Inherit;


public class Teacher extends Employee {
    //新手机添加了新的功能，重写父类的方法
    @Override
    public void show(){
        super.show();
        System.out.println("显示归属地");
        System.out.println("显示号码");
    }

}
