package eigteen_arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] source = {0, 0, 0, 0, 0};
        int[] target = {0, 0, 0, 0, 0};

        int i = -1;
        while (++i < source.length) {
            switch (i) {
                case 0:
                    System.out.println("First number? ");
                    source[i] = input.nextInt();
                    break;
                case 1:
                    System.out.println("Second number? ");
                    source[i] = input.nextInt();
                    break;
                case 2:
                    System.out.println("Third number? ");
                    source[i] = input.nextInt();
                    break;
                case 3:
                    System.out.println("Fourth number? ");
                    source[i] = input.nextInt();
                    break;
                case 4:
                    System.out.println("Last number? ");
                    source[i] = input.nextInt();
                    break;
            }
        }
        for(int i2 = 0; i2 < source.length ; ++i2){
            target[i2] = source[i2];
        }
        System.out.println("First array: ");
        for(int i3: source){
            System.out.print(i3);
        }
        System.out.println("\nSecond array:");
        for(int i4: target){
            System.out.print(i4);
        }
    }
}
