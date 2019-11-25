import java.util.Calendar;
import java.util.Date;

public class Demo06Calender {
    public static void main(String[] args) {
        /*
            java中的Calendar日历类
            Calendar是一个抽象类，里面提供了很多操作日历字段的方法
            Calendar不能直接使用，里面提供了一个静态方法getInstance(),该方法返回了Calendar类的子类对象
            static Calendar getInstance () 使用默认时区和语言环境获得一个日历
         */


        Calendar cl = Calendar.getInstance();
        System.out.println(cl);

        method3();

    }

    public static void method3(){
        //Calendar中的getTime()方法 把日历对象转化为日期对象
        Calendar cls = Calendar.getInstance();
        Date time = cls.getTime();
        System.out.println(time);   //Mon Nov 25 22:22:42 CST 2019
    }


    public static void method2(){
        //Calendar中成员的add方法
        //public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定时间量
        //amount 正数是增加，负数是减少
        Calendar cls = Calendar.getInstance();
        cls.add(Calendar.YEAR,2);

        cls.add(Calendar.MONTH,-2);

        int i = cls.get(Calendar.YEAR);
        System.out.println("获取日历中的年份" + i); //2019

        int i1 = cls.get(Calendar.MONTH);
        System.out.println("获取日历中的月份" + i1);
    }




    public static void method1(){
        //Calendar中成员的set方法的使用
        //public void set(int field， int value):将给定日历字段设置为给定的值
        Calendar cls = Calendar.getInstance();

        //设置日历中的年月日
        cls.set(Calendar.YEAR,9999);
        cls.set(Calendar.MONTH,9);
        cls.set(Calendar.DATE,10);


        //同时设置年月日
        cls.set(9999,9,9);


        int i = cls.get(Calendar.YEAR);
        System.out.println("获取日历中的年份" + i); //2019

        int i1 = cls.get(Calendar.MONTH);
        System.out.println("获取日历中的月分" + (i1 + 1)); //10   获取的是西方的月份，中国的月份要+1使用

        int date = cls.get(Calendar.DATE);
        System.out.println("获取日历中的日" + date);   //25



    }



    public static void method(){
        //Calendar中成员的get方法使用
        Calendar cls = Calendar.getInstance();
        int i = cls.get(Calendar.YEAR);
        System.out.println("获取日历中的年份" + i); //2019

        int i1 = cls.get(Calendar.MONTH);
        System.out.println("获取日历中的月分" + (i1 + 1)); //10   获取的是西方的月份，中国的月份要+1使用

        int date = cls.get(Calendar.DATE);
        int date1 = cls.get(Calendar.DAY_OF_MONTH);
        System.out.println("获取日历中的日" + date);   //25
        System.out.println("获取日历中的日" + date1);   //25
    }
}
