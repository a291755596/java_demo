package InnerClass;

public class InnerClass01 {
    public static void main(String[] args) {
        //调用外部类的对象，使用外部类的方法间接使用内部类的对象
        Body body = new Body();
        body.method();


        //内部类直接调用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
