package day13;

public class Student {//the template of being a student
    //fields:id,name,age,gender -- define as a student, what information it needs
    int id;
    String name;
    int age;
    String gender;

    //methods--define as a student, what it can do
    //study, takeExam
    public void study(){
        System.out.println(name+" is studying");
    }
    public void takeExam(){
        System.out.println("this student is taking an exam, the id is "+id);
    }

}
