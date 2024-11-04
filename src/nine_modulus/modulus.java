package nine_modulus;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean exit = false;
        int eggs;

        while(!exit){
            System.out.println("Continue harvesting eggs or stop?");
            String scanner = input.nextLine();

            if(scanner.equals("Stop") || scanner.equals("stop")){
                exit = true;
            } else {
                System.out.println("how many eggs are there?");
                eggs = input.nextInt();
                System.out.println("Each of the four sisters gets " + (eggs/4) + " eggs and the duckbear gets " + (eggs%4));
                input.nextLine(); // nextInt doesn't seem to also be a nextLine
            }


        }

    }
}
