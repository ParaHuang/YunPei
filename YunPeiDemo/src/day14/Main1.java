package day14;

public class Main1 {
    public static void main(String[] args) {

        Student stu1 = new Student();

//        stu1.id = 1001;
        stu1.setId(1001);       //1001
//        stu1.name = "Jack";
        stu1.setName("Jack");
//        stu1.age = -18;
        stu1.setAge(18);
//        stu1.gender = "male";
        stu1.setGender("male");

        stu1.study();
        stu1.takeExam();

        System.out.println();

        Student stu2 = new Student();
        stu2.setId(1002);       //1002
        stu2.setName("Alex");
        stu2.setAge(17);
        stu2.setGender("female");

        stu2.study();
        stu2.takeExam();

    }
}
