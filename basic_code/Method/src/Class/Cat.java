package Class;

//类中的this指向问题
//当方法的局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
//如果需要访问本类当中的成员，需要使用this.成员变量名的形式

//通过谁调用，this就指向谁，这里this指向的就是cat这个类，this.name就是cat类下的成员变量
public class Cat {
    String name;

    public void  sayhello(String name){
        System.out.println(name + "你好我是" + this.name);
    }
}
