package InnerClass;

public class DemoMain02 {
    public static void main(String[] args) {
        Heros heros = new Heros();
        heros.setName("jackwang");

        //设置英雄技能，可以使用实现类，也可以使用匿名函数
        //1、使用实现类
        heros.setSkill(new SkillImpl());
        heros.attack();

        //2、使用匿名函数实现
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("匿名函数中的攻击");
            }
        };

        heros.setSkill(skill);
        heros.attack();

        //3、使用匿名函数和匿名对象的简化写法
        heros.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("匿名函数和匿名对象中的攻击");
            }
        });

        heros.attack();
    }
}
