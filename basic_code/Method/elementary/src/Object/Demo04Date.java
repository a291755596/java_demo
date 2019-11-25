package Object;


import java.util.Date;

public class Demo04Date {
    public static void main(String[] args) {
        //获取当前毫秒值
        System.out.println(System.currentTimeMillis());

        //空参数构造方法
        //Date()获取的就是当前系统的日期和时间
        Date date = new Date();
        System.out.println(date);   //Thu Nov 21 16:45:01 CST 2019


        //有参数构造方法
        //Date(long date):传递毫秒值，把毫秒转化为日期
        Date d1 = new Date(System.currentTimeMillis());
        Date d2 = new Date(0L);

        System.out.println(d1); //Thu Nov 21 16:48:42 CST 2019
        System.out.println(d2); //Thu Jan 01 08:00:00 CST 1970


        //long getTime():date类的成员方法，把日期转化为毫秒(相当于System.currentTimeMillis())
        Date d3 = new Date();
        long time = d3.getTime();
        System.out.println(d3); //Thu Nov 21 16:53:12 CST 2019
        System.out.println(time); //1574326392168
    }
}
