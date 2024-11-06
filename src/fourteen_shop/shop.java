package fourteen_shop;

import java.util.Scanner;

/*
first idea: array
put every object in an array as a string and ask for which to target
make it so the first letter of each word in the item is not case-sensitive by including OR statements

assignment requires I use a switch statement,
shouldn't be too hard and is probably exactly what I was thinking of doing anyway
 */

public class shop {
    public static void main(String[] args) {

        boolean exit = true;
        float Discount = 1F;
        String[] wares = {"Rope", "Torches", "Climbing Gear", "Clean Water", "Machete", "Canoe", "Food Supplies"};
        Scanner selection = new Scanner(System.in);

        System.out.println("You enter the Store");
        System.out.println("Please, enter your name below:");
        String selected = selection.nextLine();
        if (selected.equals("Noid")) {
            Discount = 2F;
        }
        for (String item : wares) {
            System.out.println(item);
        }
        System.out.println("Tell me what you'd like and I'll name it's price. If you want to leave, just say 'exit'");

        while (exit) {
            selected = selection.nextLine();
            switch (selected) {
                case "Rope", "rope":
                    System.out.println(selected + " would cost you " + (10/Discount) + "G");
                    break;
                case "Torches", "torches":
                    System.out.println(selected + " would cost you " + (15/Discount) + "G");
                    break;
                case "Climbing Gear", "Climbing gear", "climbing Gear", "climbing gear":
                    System.out.println(selected + " would cost you " + (25/Discount) + "G");
                    break;
                case "Clean Water", "Clean water", "clean Water", "clean water":
                    System.out.println(selected + " would cost you " + (1/Discount) + "G");
                    break;
                case "Machete", "machete":
                    System.out.println(selected + " would cost you " + (20/Discount) + "G");
                    break;
                case "Canoe", "canoe":
                    System.out.println(selected + " would cost you " + (200/Discount) + "G");
                    break;
                case "Food Supplies", "Food supplies", "food Supplies", "food supplies":
                    System.out.println(selected + " would cost you " + (2/Discount) + "G");
                    break;
                case "Exit", "exit":
                    System.out.println("Bye bye!");
                    exit = false;
                    break;
                default:
                    System.out.println("I didn't quite catch that. Check your spelling, maybe?");
            }
        }
    }
}
