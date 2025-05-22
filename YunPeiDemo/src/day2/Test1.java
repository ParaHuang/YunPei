package day2;

public class Test1 {
    public static void main(String[] args) {
        int num = 13;
//        System.out.println(num % 2);
        if(num%2 == 0){
            System.out.println(num+" is an even number");
        }else{
            System.out.println(num+" is an odd number");
        }

        //define a variable
        int score = 59;
        if(score>=60){
            System.out.println("Congratulations, you passed the exam");
        }else{
            System.out.println("Sorry you failed");
        }

//        if(1<5){
//            System.out.println("hello");
//        }

        System.out.println("the end");
    }
}
