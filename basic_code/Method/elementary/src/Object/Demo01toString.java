package Object;

public class Demo01toString {
    public static void main(String[] args) {
        //person类默认继承了Object类。可以使用Object中的toString方法
        Person person = new Person("张三",18);

        //打印出来的person对象是一个地址值
        //直接打印对象的名字，就是调用对象的toString方法
        System.out.println(person);
        System.out.println(person.toString());
    }
}
