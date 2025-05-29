package day5;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
//        int x = random.nextInt();
        //int x = random.nextInt(5);      //0~bound-1
        int x = random.nextInt(5,10);   //origin~bound-1
        System.out.println(x);
    }
}
