package day5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();            //next()把空白符号当成结束指令  nextLine()把回车键当成结束指令
        int num = scanner.nextInt();
        double deci = scanner.nextDouble();
        System.out.println("你刚刚输入了："+str);
        System.out.println("你刚刚输入了："+num);
        System.out.println("你刚刚输入了："+deci);
        //343434        hello
        //"343434"      "hello"
    }
}
