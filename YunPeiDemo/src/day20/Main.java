package day20;

public class Main {
    public static void main(String[] args) {
        Chinese c = new Chinese();
        c.eat();            //call the eat from Chinese
        c.sleep();
        System.out.println();

        American a = new American();
        a.eat();
        a.sleep();
    }
}
