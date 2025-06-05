package day9;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //define an array to save 5 integer values
        //they represent  5 grades
        int[] arr = new int[5];
        //enter every grade
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("please enter grade "+ (i+1) +":");
            arr[i] = scanner.nextInt();
        }

        //print grades all at once
        int sum = 0;
        System.out.println("please check all grades:");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
            sum += arr[i];
        }

        int avg = sum/arr.length;

        System.out.println("the total score is:"+sum);
        System.out.println("the average score is:"+avg);
    }
}
