package InnerClass;

public class Hero {
    //类做为成员变量的类型
    private String name;
    private int age;

    //把武器类做为成员变量传递进来
    private Weapon weapon;

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println(age + "岁的"+ name +"拿着"+ weapon.getCode() +"去攻击敌人");
    }

    public Hero() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
