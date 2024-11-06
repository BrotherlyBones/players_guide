package thirteen_geoguessr;

import java.util.Scanner;

//you've seen enough while loops by now, i can't be bothered anymore.
//i Would make one or two variables for the position of the tower to be specified if it was necessary
public class geoguessr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first number?");
        int first = input.nextInt();
        System.out.println("second number?");
        int second = input.nextInt();

        //it Really Really feels like there should be a more compact way of doing this
        //I at least know that, with a little math, I could calculate the angle from the given point to the set point
        //but that doesn't help with making this any smaller
        if(first == 0 & second == 0){
            System.out.println("Tower");
        } else if(first > 0 && second == 0){
            System.out.println("Straight North");
        } else if(first > 0 && second > 0){
            System.out.println("Northeast");
        } else if(first == 0 && second > 0){
            System.out.println("Straight East");
        } else if(first < 0 && second > 0){
            System.out.println("Southeast");
        } else if(first < 0 && second == 0){
            System.out.println("Straight South");
        } else if(first < 0 && second < 0){
            System.out.println("SouthWest");
        } else if(first == 0 && second < 0){
            System.out.println("Straight West");
        } else if(first > 0 && second < 0){
            System.out.println("NorthWest");
        } else {
            System.out.println("I need whole numbers, thanks.");
        }
    }
}