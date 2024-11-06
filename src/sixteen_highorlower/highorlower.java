package sixteen_highorlower;

import java.util.Scanner;

public class highorlower {
    public static void main(String[] args){

        Scanner bytescanner = new Scanner(System.in);
        byte guess = -1;

        System.out.println("Give me the number to guess for from 0 to 100");
        byte target = bytescanner.nextByte();
        System.out.println("Good, the game can begin \n\n\n\n\n\n\n\n\n\n\n\n Guess a number from 0 to 100");

        while(guess != target){
            guess = bytescanner.nextByte();

            if (guess > target){
                System.out.println("lower");
            } else if (guess < target){
                System.out.println("higher");
            }
        }
        System.out.println("You've guessed the number.");
    }
}
