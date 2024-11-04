package eight_trangels;

import java.util.Scanner;

public class trangels {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean exit = false;
        float width;
        float height;
        float result;

        while(!exit){
            System.out.println("Continue making triangles or stop?");
            String scanner = input.nextLine();

            if(scanner.equals("Stop") || scanner.equals("stop")){
                exit = true;
            } else {
                System.out.println("width?");
                width = input.nextFloat();
                System.out.println("Height?");
                height = input.nextFloat();
                result = (width*height)/2;
                System.out.println("The area of your triangle is " + result);
                System.out.println("");
                System.out.println("");
                System.out.println("");
                input.nextLine(); // nextFloat doesn't seem to also be a nextLine
            }


        }

    }
}
