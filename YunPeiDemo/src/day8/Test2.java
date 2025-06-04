package day8;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret_number = random.nextInt(1,101);
        System.out.println("Hello , the computer just generated a number which is in the range of 1 to 100...");

        while(true) {
            System.out.println("guess what it is?");
            int guess = scanner.nextInt();
            if(guess > secret_number){
                System.out.println("too big");
            }else if(guess < secret_number){
                System.out.println("too small");
            }else{//guess== secret_number
                System.out.println("congratulations, you guessed right!");
                break;
            }

        }
    }
}
