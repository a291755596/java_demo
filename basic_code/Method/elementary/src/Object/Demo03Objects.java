package Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String a = null;
        String b = "abc";

        //null是不能调用方法的，所以会抛出空指正异常
        //boolean s = a.equals(b);
        //System.out.println(s);


        /*
            用objects对象可以防止空指针异常
            objects的类对两个对象进行比较，防止空指针异常
            public static boolean equals(Object a, Object b) {
                return (a == b) || (a != null && a.equals(b));
            }

        */

        boolean equals = Objects.equals(a, b);
        System.out.println(equals);

    }
}
