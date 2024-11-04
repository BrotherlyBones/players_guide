package ten_multipliddition;

import java.util.Scanner;

public class multipliddition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean exit = false;
        int estates;
        int duchies;
        int provinces;

        while (!exit) {
            System.out.println("want to count your country or stop?");
            String scanner = input.nextLine();

            if (scanner.equals("Stop") || scanner.equals("stop")) {
                exit = true;
            } else {
                System.out.println("how many estates?");
                estates = input.nextInt();
                System.out.println("how many duchies?");
                duchies = input.nextInt();
                System.out.println("how many provinces?");
                provinces = input.nextInt();

                System.out.println("Your point total comes to: " + (estates + 3 * duchies + 6 * provinces));
                input.nextLine(); // nextInt doesn't seem to also be a nextLine
            }


        }

    }
}
