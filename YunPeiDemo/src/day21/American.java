package day21;

public class American extends Human {
    @Override
    public void eat() {
        System.out.println("American like pizza");
    }
}

//overload:in the same class, methods are in the same name but with different parameters
//(purpose:supply many options to use method)
//override:in SubClass, rewrite the method from SuperClass