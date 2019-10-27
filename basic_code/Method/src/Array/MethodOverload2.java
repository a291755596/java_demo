public class MethodOverload2 {
    public static void main(String[] args) {
        println("hello,world");
        println(100);
        println(true);
    }

    public static void println(byte num){
        System.out.println(num);
    }

    public static void println(short num){
        System.out.println(num);
    }

    public static void println(int num){
        System.out.println(num);
    }


    public static void println(char zifu){
        System.out.println(zifu);
    }

    public static void println(boolean is){
        System.out.println(is);
    }

    public static void println(String str){
        System.out.println(str);
    }
}
