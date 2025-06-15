package day13;

public class Main1 {
    public static void main(String[] args) {
        //initialize:the process of creating an object
        //Type instanceName = new Type();
        //new:create
        Student stu = new Student();
        //.     ->   's  ,    of
        stu.id = 1001;
        stu.name = "Jack";
        stu.age = 18;
        stu.gender = "male";


        //calling stu's study method
        stu.study();
        stu.takeExam();

        Student stu2 = new Student();
        stu2.id = 1002;
        stu2.name = "Alex";
        //null->nothing
        stu2.study();
        stu2.takeExam();

    }
}
