package Static;

public class Student {
    private String name;
    private int age;
    static String room;
    private int Id;
    private static int idcounter = 0;


    public Student() {
        this.Id = ++idcounter;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.Id = ++idcounter;

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
}
