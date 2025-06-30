package day19;

public class Son extends Father{
    public Son(){
        //super();    //调用Father()
        super(5);
        System.out.println("the constructor of Son~~~~");
    }

}
