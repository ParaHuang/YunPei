package day6;

public class Test2 {
    public static void main(String[] args) {
        /*
        //situation 1:endless loop(the result of expression is true forever)
        int i=1;
        while(i<=5){
            System.out.println("hello");
        }
        */

        /*
        //situation 2:   0 loop(the result of expression is false)
        int i=1;
        while(i>=5){
            System.out.println("hello");
        }
        */



        //situation 2:   several times of loop
        // (the result of expression is true in the beginning,after several times, become false)

        //print hello for 5 times
        int i=1;            //loop variable
        while(i<=5){
            System.out.println("hello");
            i++;    //i+=1;  //i=i+1     //change loop variable
        }

    }
}
