package day9;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        //define an array to save 10 integer values
        int[] arr = new int[10];
        //each position is used to save a random integer number which is from 1 to 100
        Random random = new Random();

//        arr[0] = random.nextInt(1,101);
//        arr[1] = random.nextInt(1,101);
//        arr[2] = random.nextInt(1,101);
//        arr[3] = random.nextInt(1,101);
//        ......
//        arr[9] = random.nextInt(1,101);

        //generate value
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(1,101);
        }

        System.out.println("all the values in array are:");
        //print all elements
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }



        /*
        //在index为0的element中，存放27
        arr[0] = 27;
        //在index为4的element中，存放91
        arr[4] = 91;
        */
    }
}
