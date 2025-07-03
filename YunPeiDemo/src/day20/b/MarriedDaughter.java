package day20.b;

import day20.a.Father;

public class MarriedDaughter extends Father {
    public void test1(){
        //得到Father的instance->super
        super.c = 2;
        super.d = 12;
    }
}
