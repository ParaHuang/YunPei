package day16;

public class Date {
    private int year;
    private int month;
    private int day;

    //constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(int year, int month) {
        this(year,month,1);
//        this.year = year;
//        this.month = month;
//        this.day = 1;
    }

    public Date(int year) {
        this(year,1,1);
    }

    public Date() {
        this(2025,1,1);
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public void test1(){
        System.out.println("test1--------");
    }
    public void test2(){
        System.out.println("test2---------");
        test1();
    }
}
