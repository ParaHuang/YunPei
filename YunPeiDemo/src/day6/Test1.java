package day6;

public class Test1 {
    public static void main(String[] args) {
//        switch ...case...
        int month = 9;
        //1->it has 31 days
        //2->it has 28 days
        //3->it has 31 days

        //1,3,5,7,8,10,12   ->  31
        //4,6,9,11          ->  30
        //2                 ->  28
        //others            ->  invalid number
        /*
        if(month==2){
            System.out.println("it has 28 days");
        }else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("it has 30 days");
        }else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("it has 31 days");
        }else{
            System.out.println("invalid month");
        }
        */
        switch (month){     //discuss the possible value of month
            case 2:
                System.out.println("it has 28 days");
                break;      //防止穿透现象
            case 4,6,9,11:
                System.out.println("it has 30 days");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("it has 31 days");
                break;
            default:
                System.out.println("invalid month");
        }

    }
}
