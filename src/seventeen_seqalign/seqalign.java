package seventeen_seqalign;

import java.util.Scanner;

public class seqalign {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sequencePoint = 0;

        while (sequencePoint < Double.MAX_VALUE){
            sequencePoint++;
            if (sequencePoint % 3 == 0 && sequencePoint % 5 == 0) {
                System.out.print(sequencePoint + ": Blue");
            } else if(sequencePoint % 3 == 0){
                System.out.print(sequencePoint + ": Red");
            } else if (sequencePoint % 5 == 0){
                System.out.print(sequencePoint + ": Yellow");
            } else {
                System.out.print(sequencePoint + ": White");
            }
            input.nextLine(); //makes it much more readable to slow it down to however quickly the user hits Enter
        }
    }
}
