package day5;

import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("请选择：1-石头  2-剪刀   3-布：");

        int user = scanner.nextInt();          //接收输入一个int数据
//        System.out.println("you just entered :"+user);
        //显示用户的选择
        if(user == 1){
            System.out.println("您选择了石头");
        }else if(user == 2){
            System.out.println("您选择了剪刀");
        }else{
            System.out.println("您选择了布");
        }

        //电脑出拳（随机数）
        int computer = random.nextInt(1,4);
        if(computer == 1){
            System.out.println("电脑选择了石头");
        }else if(computer == 2){
            System.out.println("电脑选择了剪刀");
        }else{
            System.out.println("电脑选择了布");
        }

        //判断输赢
        if(user == computer){
            System.out.println("平局");
        }else if(user==1 && computer==2 || user==2 && computer==3 || user==3 && computer==1){
            System.out.println("恭喜你，赢了");
        }else{
            System.out.println("很遗憾，你输了");
        }




        System.out.println("the end");


    }
}
