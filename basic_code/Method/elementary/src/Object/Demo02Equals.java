package Object;

public class Demo02Equals {
    public static void main(String[] args) {
        //Person继承了Object类，所以可以使用Object中的equals方法
        //boolean equals(Object obj)
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        //Person p2 = new Person("古力娜扎",18);

        /*equals源码：

            public boolean equals(Object obj) {
                return (this == obj);
            }

            ==是比较运算符，如果是基本数据类型，比较的是值，如果是引用数据类型，比较的是地址值
            this，是谁调用这个方法，this就代表的是谁，这里面是p1调用的equals方法，所以this指的是p1这个方法
            obj，是传递过去的对象p2


        */

        System.out.println(p1);
        System.out.println(p2);

        boolean equals = p1.equals(p1);
        System.out.println(equals);

    }
}
