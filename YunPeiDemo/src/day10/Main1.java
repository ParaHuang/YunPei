package day10;

import java.util.Random;

public class Main1 {
    /*
    def funName(a,b,c):
        operations
     */

    /*
    function-> a code block with certain logic
    public returnType funName(parameters){
        operations
    }
    parameters: the data that functions need to finish the operations
     */

    //1.no parameters, no return value
    //no matter when, no matter where to call this function, make no difference
    /*
    public void funName(){
        operations
    }
    call:           funName();
     */

    public static void print5Hello() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
        }
    }

    //2.with parameters, no return value（ do same process, have different result）
    /*
    public void funName(type1 name1,type2 name2,type3 name){
        operations
    }
    call:           funName(value1,value2,value3);
     */
    public static void printHello(int n, String x) {
        for (int i = 1; i <= n; i++) {
            System.out.println(x);
        }
    }

    //3.no parameters, with return value
    public static int generateNumber1to100(){
        Random random = new Random();
        int num = random.nextInt(1,101);
        return num;
    }

    //4.with parameters, with return value
    public static String dumplingFactory(String filling){
        System.out.println("和面");
        System.out.println("擀面皮");
        System.out.println("把"+filling+"馅包入面皮");
        return filling+"陷饺子";
    }

    //传入两个整数，计算两个数字的和
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }

    //定义一个function，名字叫做isLeapYear
    //传入一个整数，代表year
    //返回一个数据，能够代表这个year是不是leap year

    public static void main(String[] args) {
        System.out.println("------no parameter,no return------");
        print5Hello();
        System.out.println("------with parameter,no return------");
        printHello(3, "hello");      //3,hello
        System.out.println();
        printHello(7, "你好");      //7,你好

        System.out.println("------no parameter,with return------");
        int x = generateNumber1to100();
        System.out.println(x);

        System.out.println("------with parameter,with return------");
        String y = dumplingFactory("肉牛");
        System.out.println("得到了"+y);

        int z = add(12,6);
        System.out.println("结果是："+z);
    }
}
