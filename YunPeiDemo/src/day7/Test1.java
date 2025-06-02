package day7;

public class Test1 {
    public static void main(String[] args) {
        //1.print all the 3 digits  number  ->  3 digit narcissistic number
        //（narcissistic number ： the cube of every digit  add together equals as this number itself. for instance: 153 = 1*1*1 + 5*5*5 + 3*3*3)
        int i = 100;
        while(i<1000){
//            only when it's narcissistic number
            // i -> 286
            int a = i/100;//hundreds
            int b = i/10%10;//tens
            int c = i%10;//ones
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i);
            }
            i++;
        }

    }
}
