package API;

import java.util.Random;
import java.util.Scanner;

public class api_random {
    public static void main(String[] args) {
        Random ram = new Random();

        //如果参数为空，那么将产生int范围的随机数字 包含负数
        int num = ram.nextInt();
        System.out.println("随机数为：" + num);


        //如果参数不为空，里面的参数代表了范围，左闭右开
        //int num = ram.nextInt(3)  代表了0-2之间的随机数
        int num1 = ram.nextInt(3);
        System.out.println(num1);



        //打印一个1-n的随即数
        //打印左闭右闭的随机数取件
        int n = 5;


        for (int i = 0; i < 10; i++) {
            int result = ram.nextInt(n) + 1;
            System.out.println("输出1-5之间的随机数：" + result);
        }


        //猜数字的小游戏
        //1、先生生成一个随机数
        //生成一个0-100之间的随机数
        int num2 = ram.nextInt(100) + 1;
        System.out.println("随机数已经生成，请输入一个数字");

        //2、获取用户在键盘上输入的数据
        Scanner sc = new Scanner(System.in);

//      10次机会
        for (int i = 0; i < 10; i++) {
            int data = sc.nextInt();
            if(data > num2){
                System.out.println("您输入的数字太大了");
            }else if(data < num2){
                System.out.println("您输入的数字太小了");
            }else{
                System.out.println("恭喜你，答对了");
            }
        }

        System.out.println("机会已经用完了");
    }
}
