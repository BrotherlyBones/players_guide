package twenty_Firstmethod;


import java.util.Scanner;

public class Firstmethod {
    static Scanner input = new Scanner(System.in);

    static public int askForNumber(String text, int min, int max) {
        int output = -0;
        while (output < min || output > max) {
            System.out.println(text);
            output = input.nextInt();
        }
        return output;
    }
}
