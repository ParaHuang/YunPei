package day20.a;

public class Neighbor {
    public void test1(){
        //如果要使用Father的field，先需要得到Father的instance
        Father f = new Father();
        f.b = 22;
        f.c = 22;
        f.d = 22;
    }
}
