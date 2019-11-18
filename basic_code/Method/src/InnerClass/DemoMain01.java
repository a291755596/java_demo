package InnerClass;

public class DemoMain01 {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setName("jackwang");

        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon();
        weapon.setCode("多兰剑");

        hero.setWeapon(weapon);

        hero.attack();
    }

}
