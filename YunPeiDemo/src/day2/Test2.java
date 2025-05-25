package day2;

public class Test2 {
    public static void main(String[] args) {
        //divisible  =  no remainder

        //leap year:
        //          A1                          A2
        //1.it's divisible by 4,      but   not divisible by 100                A
        //2.it's divisible by 400                                               B

        int year = 2024;//leap year?
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
