package Static;


/*
    如果一个成员使用了static关键字，那么这个变量将不再属于对象自己，而是属于所在类
    多个对象共享同一份数据

*/
public class Static01 {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);

        one.room = "上海101教室";
        System.out.println("姓名："+ one.getName() +"，年龄："+ one.getAge()
                + "，教室：" + one.room + "学号：" + one.getId());

        Student two = new Student("黄蓉",18);
        System.out.println("姓名："+ two.getName() +"，年龄："
                + two.getAge()+ "，教室：" + two.room + "学号：" + two.getId());

    }
}
