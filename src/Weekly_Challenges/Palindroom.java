package Weekly_Challenges;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // import scanner
        String letters = "Lego Vogel";
        String srettel = "";
        int whiloop = 0;
        while(whiloop < letters.length()){
            ++whiloop;
            srettel += (letters.charAt(letters.length()-whiloop) );
        }
        System.out.println(srettel);
        if (srettel.replace(" ", "")
                .equalsIgnoreCase(letters.replace(" ",""))){
            System.out.println("Palindroom!");
            System.out.println(srettel.toLowerCase().replace(" ",""));
        }
    }
}