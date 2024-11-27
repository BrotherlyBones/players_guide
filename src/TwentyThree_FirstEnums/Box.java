//12:00-12:45

package TwentyThree_FirstEnums;

import java.util.Scanner;

import static TwentyThree_FirstEnums.FirstEnums.*;

public class Box {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temput;
        String state = LOCKED.name();
        boolean loop = true;

        while (loop) {
            System.out.print("The chest is " + state.toLowerCase() + ". What do you want to do? ");
            temput = input.nextLine().toLowerCase();
            if ((state.equals("LOCKED") && temput.equals("unlock")) || (state.equals("OPEN") && temput.equals("close"))) {
                state = CLOSED.name();
            } else if (state.equals("CLOSED") && temput.equals("open")) {
                state = OPEN.name();
            } else if (state.equals("CLOSED") && temput.equals("lock")) {
                state = LOCKED.name();
            } else if (temput.equals("exit")) {
                loop = false;
            } else {
                System.out.println("Invalid input, input is \"" + temput + "\"");
            }
        }
    }
}