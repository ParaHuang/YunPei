package day6;

public class Test4 {
    public static void main(String[] args) {
        int a1 = 10,a2=10;

        int b1,b2;
        b1 = a1++;  //use the value first, then add up itself
        b2 = ++a2;  //add up itself first, then use it
//        a1++;
//        ++a2;

        System.out.println(a1+"----"+a2);//11,11
        System.out.println(b1+"----"+b2);//10,11
    }
}
