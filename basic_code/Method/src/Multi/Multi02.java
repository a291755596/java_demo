package Multi;

public class Multi02 {
    public static void main(String[] args) {
        //对象的向上转型，多态，但是不能调用子类的方法
        Animal animal = new Dog();


        //通过instanceof来判断new出来的是哪个对象
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eatHouse();
        }

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }



        //使用多态后，如果有覆盖重写的先执行覆盖重写的代码
        //animal.method();

        //编译报错
        //animal.eatHouse();

        //如果需要调用子类的方法就必须向下转型
        //Cat cat = (Cat) animal;
        //cat.eatHouse();

        //这个是错误写法，本来new出来的是猫，不能还原成狗
        //编译不会报错，但是运行的时候会出现异常
        //Dog dog = (dog) animal;



    }
}
