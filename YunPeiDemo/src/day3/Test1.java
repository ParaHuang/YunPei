package day3;

public class Test1 {
    public static void main(String[] args) {
        //水仙花 数：
        //1.3 digits  number
        //2.the cube of every digit plus together, equals as this number itself

        //123           hundreds:1       tens:2      ones:3
        //立方              1               8           27
        //plus together     1+8+27 = 36
        // 36 != 123    ->  123不是水仙花数

        //153           hundreds:1       tens:5      ones:3
        //立方            1*1*1=1      5*5*5=125     3*3*3=27
        //加在一起          1+125+27=153
        //153==153      ->  153是水仙花数

        int number = 571;//153,370,371,407
        //1.得到每一位整数   algorithm
        int hundreds = number/100;  //math:5.43 ->java:5
        int tens = number/10%10;       //math:54.1->java:54   54%10->4
        int ones = number%10;

        //2.看每个位置上数字的立方求和，是否等于这个数本身
        //Math.pow(底数,幂)
        //cube->    Math.pow(数字,3)  ->   数字*数字*数字
        if(hundreds*hundreds*hundreds + tens*tens*tens + ones*ones*ones == number){
            System.out.println(number+"是水仙花数");
        }else{
            System.out.println(number+"不是水仙花");
        }

        //928374298 %10 ->8


//        System.out.println(hundreds);
//        square：平方       cube：立方
    }
}
