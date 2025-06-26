package day18;

public class Main1 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        System.out.println();

        Student s = new Student();
        s.eat();                //inherit from Human
        s.sleep();              //inherit from Human
        s.study();              //belongs to Student object
        System.out.println();

        Engineer e = new Engineer();
        e.eat();
        e.sleep();
        e.paint();
        System.out.println();

        Programmer p = new Programmer();
        p.eat();
        p.sleep();
        p.paint();
        p.coding();
    }
}
