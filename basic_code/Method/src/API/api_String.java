package API;

import java.util.Scanner;

public class api_String {
    public static void main(String[] args) {
        //1、使用空参构造
        //String str1 = new String();
        //System.out.println("第一个字符串为" + str1);


        //2、根据字节数组来创建字符串
        //char[] charArray = {'A','B','C'};
        //String str2 = new String(charArray);
        //System.out.println("第二个字符串为" + str2);

        //3、根据字节数组创建字符串
        //byte[] byteArray = {97,98,99};
        //String str3 = new String(byteArray);
        //System.out.println("第三个字符串为" + str3);

        //4、直接创建
        //String str4 = "Hello world!";
        //System.out.println("第四个字符串为" + str4);


        //字符串的比较和常量池相关内容
        //String str1 = "abc";
        //String str2 = "abc";

        //char[] charArray = {'a','b','c'};
        //String str3 = new String(charArray);

        //System.out.println(str1 == str2);   //true
        //System.out.println(str1 == str3);   //false
        //System.out.println(str2 == str3);   //false
        //System.out.println("===================");


        //字符串内容的比较
        //System.out.println(str1.equals(str2));  //true
        //System.out.println(str2.equals(str3));  //true
        //System.out.println("abc".equals(str1)); //true  推荐写法
        //System.out.println(str1.equals("abc")); //true  不推荐写法


        //不区分大小写的字符串内容比较,只有英文字母区分大小写
        //String str6 = "ABC";
        //System.out.println(str1.equals(str6));  //false
        //System.out.println(str1.equalsIgnoreCase(str6)); //true

        //字符串相关方法
        //String str = "jackwang ";
        //String str1 = "is cool";
        //字符串的长度方法
        //System.out.println(str.length());

        //字符串的拼接方法
        //String str3 = str.concat(str1);
        //System.out.println(str3);


        //获取指定索引字符串的位置
        //String str4 = "jackwang";
        //System.out.println(str4.charAt(1));

        //查找字符串在原本字符串的位置,如果找到了就返回索引值，如果没有找到就返回-1
        //String str5 = "Hello";
        //System.out.println(str5.indexOf("el"));

        //字符串转换相关的常用方法：
        //toCharArray   将当前字符串拆分成字符数组做为返回值
        //getBytes      获得当前字符串的底层字节数组
        //replace       新字符串替换老字符串中的数据

        //把字符串拆分为一个字符数组
        //String str = "Hello";
        //char[] chars = str.toCharArray();
        //for (int i = 0; i < chars.length; i++) {
            //System.out.println(chars[i]);
        //}

        //获取底层字符串数组
        //String str1 = "abc";
        //byte[] bytes = str1.getBytes();
        //for (int i = 0; i < bytes.length; i++) {
            //System.out.println(bytes[i]);
        //}

        //按照字符串替换新字符串的内容
        //String str2 = "aaa,bbb,ccc";
        //System.out.println(str2.replace(",","!"));

        //String str3 = "会不会玩啊，你大爷的！！！";
        //System.out.println(str3.replace("你大爷的","****"));



        //字符串的分割方法

        //按照逗号来切割字符串
//        String str = "aaa,bbb,ccc";
//        String[] str1 = str.split(",");
//        for (int i = 0; i < str1.length; i++) {
//            System.out.println(str1[i]);
//        }

        //按照空格来切割字符串
//        String str2 = "aaa bbb ccc";
//        String[] str3 = str2.split(" ");
//        for (int i = 0; i < str3.length; i++) {
//            System.out.println(str3[i]);
//        }

        //特别注意：如果字符串以英文.来进行分割的，那么切割字符串的时候需要加两个反斜杠
//        String str4 = "aaa.bbb.ccc";
          //String[] str5 = str4.split(".");  //这是错误写法
//        String[] str5 = str4.split("\\.");
//        for (int i = 0; i < str5.length; i++) {
//            System.out.println(str5[i]);
//        }

        //定义一个数组，按照指定方法拼接成一个字符串,输入{1,2,3}，输出[word1#word2#word3]
//        int [] array = {1,2,3};
//
//        String str1 = fromArrayToString(array);
//        System.out.println(str1);



        //统计用户输入字符串，大写字母，小写字母，数字和特殊字符的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        //用户输入字符串后，先要把字符串拆开 toCharArray();

        char[] str = input.toCharArray();
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if('A'<= ch && ch <='Z'){
                //大写字母统计
                countUpper++;
            }else if('a'<= ch && ch <='z'){
                //小写字母统计
                countLower++;
            }else if('1'<= ch && ch <='9'){
                //数字统计
                countNumber++;
            }else{
                //特殊字符统计
                countOther++;
            }
        }

        System.out.println("大写字母" + countUpper + "个");
        System.out.println("小写字母" + countLower + "个");
        System.out.println("数字" + countNumber + "个");
        System.out.println("特殊字符" + countOther + "个");
    }

//    public static String fromArrayToString(int[] array){
//        String str = "[";
//        for (int i = 0; i < array.length; i++) {
//            if(i == array.length - 1){
//                str += "word" + array[i] + "]";
//            }else{
//                str += "word" + array[i] + "#";
//            }
//
//        }
//
//        return str;
//    }
}
