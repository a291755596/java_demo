package API;

import java.util.ArrayList;
import java.util.Random;

public class api_arraylist {
    public static void main(String[] args) {
        //数组的长度不可发生改变，但是ArrayList集合的长度是可以发生改变的
        //ArrayList文档上面会有<E>的表示，这代表类的集合是一个泛型
        //泛型:装在集合中的所有元素都是统一类型，泛型只能是引用类型

        //创建了一个ArrayList集合，集合名称是list，里面全部都String类型的数据
        //JDK1.7开始，右侧尖括号的内容可以省略，但是还是要写尖括号

        //如果直接打印ArrayList得到的是内容，而不是地址值
        //ArrayList<String> list = new ArrayList<>();

        //往集合里面添加数据，使用add的方法
        //list.add("jackwang");
        //System.out.println("ArrayList:"+ list);

        //ArrayList常用的方法：
        //1、add方法：public boolean add(E e)向集合中添加元素，参数的类型一致
        //2、get方法：public E get(int index)从集合中获取元素，参数是索引编号，返回值就是对应的元素位置
        //3、remove方法 public E remove(int index)从集合中删除元素，参数是索引编号，返回值就是删除的那个元素
        //4、size方法 public int size() 获取集合的尺寸长度，返回值是集合中包含的元素个数


        //向集合中添加元素
        //list.add("Jhon");
        //list.add("tonney");
        //list.add("jemmy");

        //System.out.println("ArrayList:" + list);
        //获取集合尺寸长度
        //System.out.println(list.size());

        //从集合中删除元素，返回的是被删除的那个值
        //System.out.println(list.remove(2));
        //打印集合，仅有三条
        //System.out.println(list);

        //通过索引编号获取集合中的内容
        //System.out.println("通过索引编号获取内容：" + list.remove(2));


        //ArrayList的遍历
        //for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        //}







        //ArrayList是一个泛型的数据集合，一般存储的都是引用数据类型
        //如果想要使用基本数据类型，就需要使用基本类型对应的包装类
        /*基本类型      包装类(引用类型都在java.lang下)
           byte         Byte
           short        Short
           int          Integer(特殊)
           long         Long
           float        Float
           double       Double
           char         Character(特殊)
           boolean      Boolean

         */

        //生成1-33之间的随机数，添加到集合并遍历集合
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("循环的数据为：" + list.get(i));
        }














    }
}
