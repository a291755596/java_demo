package InnerClass;

public class Outer {

    int num = 10;   //外部类的成员变量

    public class Inner{
        int num = 20;   //内部类的成员变量

        public void method(){
            int num = 30;   //内部类方法的局部变量
            System.out.println(num);    //打印的是内部类方法的局部变量 就近原则
            System.out.println(this.num);   //打印的是内部类的成员变量
            System.out.println(Outer.this.num); //打印的是外部类的成员变量
        }
    }
}
