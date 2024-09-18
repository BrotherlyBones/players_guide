package four_basicinput;

import java.util.Scanner;

public class basicinput {
    public static void main(String[] args){
    Scanner scannerObj = new Scanner(System.in);
    System.out.println("Who thinks they're really funny?");
    String funnyman = scannerObj.nextLine();
    System.out.println("Look out guys! " + funnyman + " thinks they're funny!!!");
    }
}
