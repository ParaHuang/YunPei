package day20;

public class American extends Human{
    @Override
    public void eat() {
        System.out.println("American like pizza");
    }
}

//overload:in the same class, methods are in the same name but with different parameters
//override:in SubClass, rewrite the method from SuperClass