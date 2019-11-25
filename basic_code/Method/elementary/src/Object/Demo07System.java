import java.util.Arrays;

public class Demo07System {
    public static void main(String[] args) {
        /*
            System类提供了大量静态方法，可以获取与系统相关的信息或系统级操作，常用方法有
            public static long currentTimeMillis(); 返回以毫秒为单位的当前时间
            public static void arraycopy(Object src,int srcPos,Object dest, int destPos,int length)
            将数组中指定的数据拷贝到另一个数组中去

         */

        method02();


    }

    public static void method02(){
        //system中arraycopy类的使用   将数组中指定的数据拷贝到另一个数组中去
        //Object src    源数组
        //int srcPos    源数组中的起始位置
        //Object dest   目标数组
        //int destPos   目标数据中的起始位置
        //int length    要复制的数组元素的数量

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前" + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("替换后" + Arrays.toString(dest));






    }





    public static void method01(){
        //system中currentTimeMillis类的使用(一般用来测试程序的效率)
        System.out.println(System.currentTimeMillis()); //1574692225208

        long s = System.currentTimeMillis();

        //测试for循环10000次用时时间
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }


        long e = System.currentTimeMillis();

        System.out.println("程序耗时时间为：" + (e - s));

    }
}
