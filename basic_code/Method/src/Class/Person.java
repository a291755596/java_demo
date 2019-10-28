package Class;
//问题描述：定义person年龄的时候，无法阻止不合理的数值被设置进来
//解决方案：使用private关键字将需要保护的成员变量进行修饰
public class Person {
    String name;
    private int age;
    private boolean male;

    //如果有两个重名的构造方法，那么两个方法都会被重载
    //构造方法，没有参数的构造方法
    public Person(){
        System.out.println("这是一个构造方法，等着执行");

    }


    //有参数的构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("这是有参数的构造方法");
    }



    public void show(){
        System.out.println("我叫" + name + "今年" + age + "岁");
    }

    //使用private的时候就需要使用getter和setter方法进行修改
    //这里的方法名是需要使用固定的格式
    //这个成员方法，专门用于age的设置
    public void setAge(int num){
        //在set函数中可以写上一定的逻辑判断
        if(num < 100 && num >= 0){
            age = num;
        }else{
            System.out.println("输入的参数不合理");
        }

    }

    //这个成员方法，专门用于age的获取
    public int getAge(){
        return age;
    }

    //有boolean类型的数据的getter和setter
    public void setMale(boolean b){
        male = b;
    }

    //boolean类型的getter和其他类型不一样，需要特别注意
    public boolean isMale(){
        return male;
    }

}
