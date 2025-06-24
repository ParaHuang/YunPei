package day16;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date(2020,3,15) ;
        Date date2 = new Date(2018,4) ;
        Date date3 = new Date(2023) ;
        Date date4 = new Date() ;

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);

        date1.test2();
    }
}
