package Multi;

public class Multi01{
    public static void main(String[] args) {
        //这就属于对象的向上转型，但是不能调用子类的方法
        Fu obj = new Zi();

        obj.method();  //父子都有，优先用子
        obj.methodFu(); //子类没有，往上寻找
        //错误写法，报错是编译的时候报错，编译的时候看左边，运行的时候看右边
        //obj.methodZi();

        //如果要调用子类的方法，那么就需要向下转型【还原】
        Zi zi = (Zi) obj;
        zi.methodZi();











        //1、直接通过方法名称.变量名称的方式进行访问成员变量：
        //等号左边是Fu类，所以访问的是Fu中的成员变量
        //System.out.println(obj.num);

        //2、通过成员方法访问成员变量
        //子类没有覆盖重写：方法属于谁，就调用谁
        //子类有覆盖重写，那就是调用子类的方法
        //obj.getNum();

        //obj.method();
        //obj.methodFu();
    }
}

