package Class;

//构建一个标准的类
public class Class04 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("宝马");
        car1.setColor("black");
        car1.setPrice(54888.0);

        System.out.println("车型"+ car1.getName() + "颜色"+ car1.getColor() +"价格" + car1.getPrice());
    }

}
