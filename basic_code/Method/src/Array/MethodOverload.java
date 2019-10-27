public class MethodOverload {
    public static void main(String[] args) {
        //方法的重载
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a,int b){
        return a + b;
    }

    //这样不能触发方法重载
//    public static double sum(int a, int b){
//        return a + b + 0.0;
//    }

    //这样不能触发重载
//    public static int sum(int x, int y){
//        return x + y;
//    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
