package API;

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
        String str4 = "jackwang";
        System.out.println(str4.charAt(1));

        //查找字符串在原本字符串的位置,如果找到了就返回索引值，如果没有找到就返回-1
        String str5 = "Hello";
        System.out.println(str5.indexOf("el"));

    }

}
