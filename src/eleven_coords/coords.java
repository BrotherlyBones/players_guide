package eleven_coords;

import java.util.Scanner;
import twenty_Firstmethod.Firstmethod;

public class coords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean exit = false;
        int column;
        int row;

        while (!exit) {
            System.out.println("Continue marching to coords or stop?");
            String scanner = input.nextLine();

            if (scanner.equals("Stop") || scanner.equals("stop")) {
                exit = true;
            } else {

                column = Firstmethod.askForNumber("in which column will the attack land?", Integer.MIN_VALUE, Integer.MAX_VALUE);

                System.out.println("what about the row?");
                row = input.nextInt();

                System.out.println("For the defense, the units will need to march to the following locations:");
                System.out.println("("+ (column-1) +", "+ (row+1) +")   ("+ (column+1) +", "+ (row+1) +")");
                System.out.println(" ");
                System.out.println("("+ (column-1) +", "+ (row-1) +")   ("+ (column+1) +", "+ (row-1) +")");
                System.out.println(" \n \n ");

                input.nextLine();
            }


        }

    }
}