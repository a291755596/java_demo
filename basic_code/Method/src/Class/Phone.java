package Class;

public class Phone {
    //手机类的成员属性
    String brand;
    double price;
    String color;


    //手机类的成员方法
    //打电话
    public void Call(String who){
        System.out.println("打电话给" + who);
    }

    //发短信
    public void Sendmessage(){
        System.out.println("给所有人群发短信");
    }
}
