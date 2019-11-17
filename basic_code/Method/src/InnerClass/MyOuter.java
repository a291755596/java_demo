package InnerClass;

public class MyOuter {
    public void OuterMethod(){
        //这个变量必须是有效的final才可以
        int num = 10;

        class Inner{
            public void method(){
                System.out.println(num);
            }
        }
    }

}
