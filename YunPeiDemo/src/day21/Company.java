package day21;

//公司
public class Company {

    public void party(Human h){
        System.out.println("there is a party in company");
        h.eat();//吃饭->polymorphism
        System.out.println("party finished,time to go home");
        h.sleep();//睡觉->there is no polymorphism, because none of subclass override sleep method
    }

    /*
    public void party(Chinese c){
        System.out.println("there is a party in company");
        c.eat();//吃饭
        System.out.println("party finished,time to go home");
        c.sleep();//睡觉
    }

    public void party(American a){
        System.out.println("there is a party in company");
        a.eat();//吃饭
        System.out.println("party finished,time to go home");
        a.sleep();//睡觉
    }

    public void party(Indian i){
        System.out.println("there is a party in company");
        i.eat();//吃饭
        System.out.println("party finished,time to go home");
        i.sleep();//睡觉
    }

     */

}
//1.abstract class
//2.interface