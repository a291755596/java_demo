package Class;

public class Class02 {
    public static void main(String[] args) {
        //使用private对类进行定义
        Person per = new Person();
        per.show();

        //per.age=18;
        per.name="赵丽颖";
        per.setAge(20); //使用setter的方法对private中的年龄进行设置

        per.show();

        //System.out.println(per.age);
        //age是private的变量，在这个方法里面不能调用，所以是错误的写法
    }
}
