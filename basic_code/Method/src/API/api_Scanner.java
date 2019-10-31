package API;

import java.util.Scanner;

public class api_Scanner {
    public static void main(String[] args) {
        //获取键盘输入的一个int数字 int num = sc.nextInt();
        //获取键盘输入的一个字符串 String srt = sc.next();

        //System.in 代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的一个int数字
        int num = sc.nextInt();

        System.out.println("输入的int数字为" + num);

        //获取键盘上输入的字符串
        //String str = sc.next();

        //System.out.println("输入的字符串为"+ str);


        //键盘输入两个数字。并且求出和
//        System.out.println("请输入第一个数字");
//        int num1 = sc.nextInt();
//
//        System.out.println("请输入第二个数字");
//        int num2 = sc.nextInt();
//
//        System.out.println("两次输入的和为:" + (num1 + num2));





        //键盘输入三个数字，并且求出最大值
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
//        int num5 = sc.nextInt();
//
//        int temp = num3 > num4 ? num3 : num4;
//        int max = temp > num5 ? temp : num5;
//
//        System.out.println("程序的最大值为"+ max);
    }
}

