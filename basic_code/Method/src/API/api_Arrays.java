package API;
/*
    java.util.Arrays是一个与数组有关的工具类
    里面提供了大量的静态方法，用来实现数组的操作


*/

import java.util.Arrays;
import java.util.Scanner;

public class api_Arrays {
    public static void main(String[] args) {

        //  将参数数组变成字符串，按照默认格式[参数1，参数2，参数3]的形式
        int[] array = {1,2,3,4,5,6};
        String intStr = Arrays.toString(array);
        System.out.println(intStr);


        //数字的排序
        int[] array1 = {5,8,3,2,6,7,9,2,4,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));



        //字符串的排序
        String[] str = {"aaa","ccc","bbb"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


        //随即输入一个字符串，所有字符升序排列，然后再倒叙打印
        //1、输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请随机输入一个字符串");

        //2、把随机输入的字符串转化为数组 toCharArray
        String str1 = sc.next();

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars.length);

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
