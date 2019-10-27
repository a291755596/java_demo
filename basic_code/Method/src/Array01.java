public class Array01 {
    public static void main(String[] args) {
        int[] ArrayA = new int[3];

        int[] ArrayB = {1,2,3,4,5,6,7,8,9};

        System.out.println("数组A的长度为" + ArrayA.length);
        System.out.println("数组B的长度为" + ArrayB.length);

        //遍历数组
        for (int i = 0; i < ArrayB.length; i++) {
            System.out.println(ArrayB[i]);
        }


        //输出数组中的最大值
        int[] ArrayC = {10,20,50,60,80,100,200,3000};
        int max = ArrayC[0];
        for (int i = 1; i < ArrayC.length; i++) {
            if(ArrayC[i] > max){
                max = ArrayC[i];
            }
        }

        System.out.println("最大值为：" + max);


        //数组的反转
        int[] ArrayD = {10,20,30,40,50,60};
        for(int min = 0,maxs = ArrayD.length-1; min < maxs; min++,maxs--){
            int temp = ArrayD[min];
            ArrayD[min] = ArrayD[maxs];
            ArrayD[maxs] = temp;
        }

        for (int i = 0; i < ArrayD.length; i++) {
            System.out.println("反转后的数组" + ArrayD[i]);
        }

        int[] ArrayE = {10,20,30,40,50,60};

        printArray(ArrayE);



        //调用计算函数，把返回值返回出来
        int[] result = calculate(10,20,30);
        System.out.println("总和为" + result[0]);
        System.out.println("平均数为" + result[1]);
    }

    public static int[] calculate(int a, int b, int c){
        int sum = a+b+c;
        int arvg = sum/3;

        int[] array = {sum,arvg};

        return array;
    }



    public static void printArray(int[] ArrayE){
        for (int i = 0; i < ArrayE.length; i++) {
            System.out.println("数组中的值为" + ArrayE[i]);
        }
    }


}
