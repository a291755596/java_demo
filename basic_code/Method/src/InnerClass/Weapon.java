package InnerClass;

public class Weapon {
    //weapon是一个类，将要做为hero的成员变量类型
    private String code;    //武器的代号

    public Weapon() {
    }

    public Weapon(String code) {

        this.code = code;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
