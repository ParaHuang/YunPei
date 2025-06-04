package day8;

public class Test5 {
    public static void main(String[] args) {
        for (int i=1 ; i<=5 ; i++){
            if(i==3){
//                break;
//                continue;
                return;
            }
            System.out.println(i);
        }
        System.out.println("the end of program");
        //print all leap years in 21st century (2001~2100)
    }
}
