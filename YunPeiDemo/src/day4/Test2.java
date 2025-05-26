package day4;

public class Test2 {
    public static void main(String[] args) {
        int x = 30;
        if(x<40){
            System.out.println("AA");
            x += 20;
        }else if(x>=40 && x<60){
            System.out.println("BB");
            x += 20;
        }else if(x>=60 && x<80){
            System.out.println("CC");
            x += 20;
        }else{
            System.out.println("DD");
        }
        System.out.println(x);

    }
}
