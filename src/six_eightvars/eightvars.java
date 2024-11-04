package six_eightvars;

import java.util.Scanner;

public class eightvars {
    public static void main(String[] args){
        byte crushed = 100;
        short cut = 10*1000;
        int elligent = 1000*1000*1000;
        long john = 1000000000000000000L;
        float boat = 0.000001f;
        double trouble = 0.000000000000001;
        boolean schmoolean = false;
        char acter = '☻';
        String puppet = "Wait a minute, why is there not one zero in this:";
        System.out.println(schmoolean);
        System.out.println(acter);
        System.out.println(puppet);
        System.out.println(trouble*john*elligent*boat*cut*crushed);
        Scanner input = new Scanner(System.in);

        System.out.println("Give <127");
        crushed = input.nextByte();
        System.out.println("Byte = " + crushed);

        System.out.println("Give <32,000");
        cut = input.nextShort();
        System.out.println("Short = " + cut);

        System.out.println("Give <2 million");
        elligent = input.nextInt();
        System.out.println("Int = " + elligent);

        System.out.println("Give less than 9 (trillion/quintillion)");
        john = input.nextLong();
        System.out.println("Long = " + john);

        System.out.println("Give a fraction with less than 7 decimals");
        boat = input.nextFloat();
        System.out.println("Float = " + boat);

        System.out.println("Give a fraction with less than 16 decimals");
        trouble = input.nextDouble();
        System.out.println("Double = " + trouble);

        System.out.println("true or false");
        schmoolean = input.nextBoolean();
        System.out.println("Bool = " + schmoolean);

        System.out.println("Give One ASCII Character's value");
        acter = (char) input.nextInt();
        System.out.println("Char = " + acter);

        System.out.println("Write something");
        // the next nextLine() after a nextInt() gets skipped for some reason so this one's here to take that blow
        input.nextLine();
        puppet = input.nextLine();
        System.out.println("String = " + puppet);

    }
}
