package day17;

public class Student {
    //field,instance variable,belongs to object
    private int id;
    private String name;
    private int age;

    //belongs to class
    public static String teacherName = "Miss Yang";

    //use count to how record how many students now
    public static int count;    //default as 0

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        count++;
    }

    public Student() {
        count++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public static void test1(){
        System.out.println("static method--test1 is called");
        teacherName = "Li"; //correct, teacherName belongs to class
        test4();//correct, test4 belongs to class

        //number = 1001;      //wrong, number belongs to object
        //test2();      //wrong, test2() belongs to object
    }

    public void test2(){
        System.out.println("a normal method--test2");
    }

    public void test3(){
        System.out.println("a normal method--test3");
        test2();
    }

    public static void test4(){
        System.out.println("a static method--test4");
    }
}
