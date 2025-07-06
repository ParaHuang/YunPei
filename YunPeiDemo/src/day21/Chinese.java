package day21;

//inheritance
//every class is a subclass of Object
public class Chinese extends Human {
    //override: in subclass, rewrite the method of superclass
    @Override
    public void eat() {
        //调用superclass的eat方法
        //super.eat();
        System.out.println("Chinese eat with chopsticks");
    }

    public void kungFu(){
        System.out.println("only Chinese know kungfu");
    }
}
