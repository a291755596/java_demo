package Class;

public class Class01 {
    public static void main(String[] args) {
        //使用student的类
        //1、导包：class01和student在同一个文件夹下，所以可以省略
        //2、创建
        Student stu = new Student();

        //使用成员变量
        System.out.println(stu.age);
        System.out.println(stu.name);

        stu.name = "jackwang";
        stu.age = 28;

        System.out.println(stu.age);
        System.out.println(stu.name);

        //使用成员方法
        stu.study();
        stu.eat();

        System.out.println("=====================");

        //使用phone的类
        //1、导包，可以省略
        //2、创建
        Phone phone = new Phone();

        //使用成员变量
        phone.brand = "iphone";
        phone.color = "black";
        phone.price = 5488.0;

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);

        //使用成员方法
        phone.Call("Jhons");
        phone.Sendmessage();



        //把类（对象）作为参数传递给方法
        Phone one = new Phone();

        one.brand = "iphone";
        one.color = "black";
        one.price = 5488.0;

        method(one);


        //把类作为一个方法返回出来
        Phone three = getPhone();
        System.out.println(three.brand);
        System.out.println(three.color);
        System.out.println(three.price);

    }


    public static Phone getPhone(){
        //返回值是个Phone(类的类型)
        Phone two = new Phone();
        two.brand = "iphone";
        two.color = "black";
        two.price = 5488.0;

        return two;
    }



    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);

    }



}
