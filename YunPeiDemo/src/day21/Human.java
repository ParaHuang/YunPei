package day21;

public abstract class Human {
    //1.when a method is important, but method body is not,then declare this method as abstract
    //2.if inside a class, there is an abstract method, then this class is also abstract
    //3.the Subclass has to override the abstract method of Superclass
    //4.if Subclass doesn't override, then this Subclass is also abstract
    public abstract void eat();

    public void sleep(){
        System.out.println("Human---sleeping");
    }
}
//抽象