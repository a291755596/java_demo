package Multi;

public class Cat extends Animal {

    @Override
    public void method(){
        System.out.println("这是猫的覆盖重写");
    }

    public void eatHouse(){
        System.out.println("猫爪老鼠");
    }
}
