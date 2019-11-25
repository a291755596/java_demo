package Object;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo05DateFormat {
    public static void main(String[] args) throws ParseException {
        /*

            DateFormat类：时间、日期格式化子类的抽象类
                成员方法：
                String format(Date date) 按照指定的格式把Date日期格式化为复合模式的字符串
                Date parse(String source) 把符合模式的字符串解析为Date日期

            DateFormat是一个抽象类，不能直接使用，所以需要使用它的子类

            java.text.SimpleDateFormat extends DateFormat

            SimpleDateFormat的构造方法：
                format(String pattern):用给定的模式和默认的语言环境的日期格式符号构造
                参数：String pattern：传递指定的模式（区分大小写），写对应的模式，会把模式替换成对应的时间和日期
                "yyyy-MM-dd HH:mm:ss"   年月日时分秒  模式中的字母不能更改，但是连接模式的符号可以更改
        */



        //1、创建SimpleDateFormat并且传入指定的格式
        SimpleDateFormat spl = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        //调用format方法把日期解析为构造方法中的字符串格式
        //System.out.println(spl.format(date));


        /*
            parse的构造方法：
               Date parse(String source) 把符合模式的字符串解析为Date日期

               注意:
               public Date parse(String source) throws ParseException
               parse 方法声明了一个叫ParseException的解析异常
               如果字符串和构造方法中的模式不一样，那么程序就会抛出这个异常
               调用了一个抛异常的方法，就必须处理这个异常。要么throws继续声明抛出这个异常，要么try……catch自己处理这个异常
         */


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2018-06-19 15:22:33");
        //System.out.println(parse);   //Tue Jun 19 15:22:33 CST 2018


        BirthDay();

    }

    public static void BirthDay() throws ParseException {
        //计算一个人出生到现在多少天

        //1、首先输入自己的出生年月日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为yyyy-MM-ss");
        String BirthDay = sc.next();
        //2、把用户输入的字符串，转化为时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ss");
        Date birth = sdf.parse(BirthDay);
        //System.out.println(birth);    //Sat Feb 01 00:00:20 CST 1992
        //3、把时间转化为毫秒的格式
        long Brith = birth.getTime();
        System.out.println(Brith);  //696873620000
        //4、获取当前毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);
        //5、使用当前毫秒值减去出生年月日毫秒值
        long daysTime = l - Brith;
        //6、把毫秒值转化为天数
        long day = daysTime/1000/60/60/24;
        System.out.println("出生了" + day + "天" );
    }
}
