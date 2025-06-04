package day8;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //limit time of loop:
        //1.you know the start and end, or how many times exactly                   (for)
        //2.no idea how many times exactly, but it's going to end at some point     (while)

        //club, recuit members
        //only need 5 girls,once there are girls, then stop recuiting
        Scanner scanner = new Scanner(System.in);
        int count = 0;


        while(true){
            System.out.println("are you 1-girl or 2-boy?");
            int member = scanner.nextInt();
            if(member == 1){
                count++;
                if(count==5){
                    break;      //中断外层循环
                }
            }
        }

    }

}
