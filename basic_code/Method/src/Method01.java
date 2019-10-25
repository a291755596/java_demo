public class Method01 {
    public static void main(String[] args) {
        //方法的调用三种模式
        //1、单独调用
        sum(10,20);

        //2、打印调用
        System.out.println(sum(10,20));

        //3、赋值调用
        int summer = sum(10,20);
        System.out.println(summer);
    }


    //方法的封装
    //修饰符   返回类型  方法名 参数列表
    public static int sum(int a,int b){
        //方法体
        int result = a + b;

        //返回值
        return result;
    }
}
