package InnerClass;

public class Body { //外部类

    public class Heart{ //成员内部类
        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }
    }

    private String name = "jackwang";


    //外部类的方法
    public void method(){
        System.out.println("这是类的一个方法");

        //内部类的间接使用：
        Heart heart  = new Heart();
        heart.beat();

    }
}
