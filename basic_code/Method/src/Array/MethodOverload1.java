public class MethodOverload1 {
    public static void main(String[] args) {
        //比较两个相同类型的数据是否相等
        byte a = 10;
        byte b = 20;
        System.out.println(Same(a,b));
        System.out.println(Same((short) 10,(short) 10));
        System.out.println(Same((long) 10,(long) 18));
    }

    public static boolean Same(int a,int b){
        return a == b;
    }

    public static boolean Same(short a, short b){
        return a == b;
    }

    public static boolean Same(byte a, byte b){
        return a == b;
    }

    public static boolean Same(long a,long b){
        return a == b;
    }

}
