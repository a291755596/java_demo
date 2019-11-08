package API;

public class api_Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14)); //3.14
        System.out.println(Math.abs(0));    //0
        System.out.println(Math.abs(-2.5)); //2.5


        //向上取整
        System.out.println(Math.ceil(3.1)); //4.0
        System.out.println(Math.ceil(3.9)); //4.0
        System.out.println(Math.ceil(3.0)); //3.0


        //向下取整
        System.out.println(Math.floor(3.1)); //3.0
        System.out.println(Math.floor(3.9)); //3.0
        System.out.println(Math.floor(3.0)); //3.0

        //四舍五入
        System.out.println(Math.round(40.4)); //40
        System.out.println(Math.round(40.9)); //41
    }
}
