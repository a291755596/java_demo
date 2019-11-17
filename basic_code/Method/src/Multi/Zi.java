package Multi;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void getNum(){
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类覆盖重写父类的方法");
    }

    public void methodZi(){
        System.out.println("子类的特有方法");
    }
}
