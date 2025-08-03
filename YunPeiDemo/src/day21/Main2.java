package day21;

public class Main2 {
    public static void main(String[] args) {
        //普通的Initialize
        //Type name = new Type();
        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.sleep();
        chinese.kungFu();
        System.out.println();

        American american = new American();
        Indian indian = new Indian();
        Japanese japanese = new Japanese();



        //引用转型
        //1.引用类型会决定你能用什么方法
        //2.对象的类型会决定你能怎么用
        //reference type change
        //SuperClass name = new SubClass();
        //    用人类眼光看待他               一个真实存在的中国人对象
                 Human h1       =          new Chinese();

        Human h2 = new American();
        Human h3 = new Indian();
        Human h4 = new Japanese();

        //具体怎么eat，取决于实际对象是什么
        h1.eat();
//        h1.kungFu();//用Human的眼光看待chinese，那么human是不会kungfu的，所以报错

        h2.eat();
        h3.eat();
        h4.eat();

        System.out.println();

        h1.sleep();
        h2.sleep();
        h3.sleep();
        h4.sleep();
    }
}
