public class MethodExample {
    public static void main(String[] args) {

        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));


        count();
        printCount(10);

    }

    //比较两个数字是否相同
    public static boolean isSame(int a, int b){
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }

        return same;
    }

    //求1-100累加的和
    public static void count(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    //打印指定语句的次数
    public static void printCount(int c){
        for (int i = 0; i < c; i++) {
            System.out.println("窝窝头一块钱四个");
        }
    }
}
