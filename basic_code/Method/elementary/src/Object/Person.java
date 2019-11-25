package Object;

import java.util.Objects;

public class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    //直接打印对象的地址值没有意义，所以需要重写toString方法，打印对象的属性
//    @Override
//    public String toString() {
//        //return super.toString();
//        //return "abc";
//
//        return "Person{name="+ name +"，age="+ age +"}";
//    }


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }



    /*
        equals比较的是两个方法的地址值，没有意义，需要重写equals方法,比较两个对象的属性
        如果两个对象的属性一样，就输出true
        重写的时候传进去的是一个Object obj,但是需要传进去的内容是一个子类
        左父右子，就是一个多态
        Object obj = p2 = new Person("古力娜扎",18);

        多态是无法访问成员变量和成员方法的，所以就必须使用向下转型，把Object转型为Person类型

    */


//    @Override
//    public boolean equals(Object obj) {
//        //避免比较传递进来的对象和比较的对象是同一个对象
//        //可以再添加一个判断
//        if(obj == this){return true;
//
//        //为了提高效率还可以增加一个判断，传递的是null的话可以直接返回false
//        if(obj == null ){return false;}
//
//        //增加一个判断，防止类型转换异常ClassCastException
//        if(obj instanceof Person){
//            //如果是person类型的对象才会比较
//            //使用向下转型，把Object转型为Person类型
//            Person person = (Person)obj;
//            //比较两个对象的属性
//            //1、首先比较字符串，用字符串的equals
//            boolean equals = this.name.equals(person.name) && this.age == person.age;
//
//            return equals;
//        }
//
//        return false;
//    }


    //系统提供的equals方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        //getClass() != o.getClass() 使用反射技术，判断o是否为person类型，等效于instanceof判断
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        return name != null ? name.equals(person.name) : person.name == null;
//    }


    //java7提供的重写方法，推荐使用
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
