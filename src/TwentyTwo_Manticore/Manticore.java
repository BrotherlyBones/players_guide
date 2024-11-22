//22/11 14:30-15:43 (low energy, intellectually stimulated)

package TwentyTwo_Manticore;

import java.util.Scanner;

public class Manticore {
    public static void main(String[] args) {
        final byte cityHealth = 15;
        final byte shipMaxHP = 10;
        final byte bDmg = 1;
        final byte fDmg = 3;
        final byte eDmg = 3;
        final byte feDmg = 10;
        byte turn = 0;
        byte shipHP = shipMaxHP;
        Scanner input = new Scanner(System.in);

        System.out.print("Player 1, how far away from the city do you want to station the Manticore? ");
        byte target = input.nextByte();
        input.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlayer 2, it is your turn.");

        while(cityHealth-turn > 0 && shipHP > 0){
            System.out.println("-----------------------------------------------------------");
            System.out.println("STATUS: Round: " + ++turn +
                    " City: " + ((cityHealth+1)-turn) + "/" + cityHealth +
                    " Manticore: " + shipHP + "/" + shipMaxHP);
            System.out.println("The cannon is expected to deal "
                    + seqalign.check(turn, bDmg, fDmg, eDmg, feDmg)
                    + " damage this round.");
            System.out.print("Enter desired cannon range: ");
            if(highorlower.check(input.nextByte(),target)){
            shipHP -= seqalign.check(turn, bDmg, fDmg, eDmg, feDmg);
            }
            input.nextLine();
        }
        if (shipHP <= 0){
            System.out.println("The Manticore has been destroyed! The city has been saved!");
        } else {
            System.out.println("Pack it up, boys. We'll get 'em next time.");
        }

    }
}
