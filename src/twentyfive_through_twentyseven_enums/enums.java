package twentyfive_through_twentyseven_enums;

/*
Objectives:
Define a new Arrow class with fields for arrowhead type, fletching type, and length.
(Hint: arrowhead types and fletching types might be good enumerations.)
Allow a user to pick the arrowhead, fletching type, and length and then create a new Arrow instance.
Add a getCost method that returns its cost as a float based on the numbers above, and use this to display the arrow’s cost.

Modify your Arrow class to have private instead of public fields.
Add in getter methods for each of the fields that you have.

Modify your Arrow class one final time to include static methods of the form public static
Arrow createEliteArrow() { … } for each of the three above arrow types.
Modify the program to allow users to choose one of these pre-defined types or a custom arrow. If
they select one of the predefined styles, produce an Arrow instance using one of the new static
methods.
If they select one of the predefined styles, produce an Arrow instance using one of the new static
methods.
If they choose to make a custom arrow, use your earlier code to get their custom data
about the desired arrow.
 */

import java.util.Scanner;
import java.util.ArrayList;

enum head {
    Steel,
    Wood,
    Obsidian,
    Null
}
enum feather {
    Plastic,
    TurkeyFeathers,
    GooseFeathers,
    Null
}


public class enums {
    public static void main(String[] args){

        Boolean exit = true;
        head tip = head.Null;
        float length = 0F;
        feather quill = feather.Null;
        Scanner selection = new Scanner(System.in);
        ArrayList<Arrow> quiver = new ArrayList<Arrow>();
        Arrow arrow = new Arrow();

        System.out.println("You enter the fletcher's workshop");

        while (exit){
            System.out.println("Would you like to make a new [Arrow], check on your [Quiver] or [Exit]?");
            String selected = selection.nextLine();
            switch(selected){
                case "Arrow", "arrow":

                    selected = selection.nextLine();

                    switch(selected){
                        case "Steel":
                            tip = head.Steel;
                            break;
                        case "Wood":
                            tip = head.Wood;
                            break;
                        case "Obsidian":
                            tip = head.Obsidian;
                            break;
                    }
                    arrow.fletch(tip, length, quill);
                    break;

                case "Quiver", "quiver":

                    break;
                case "Exit", "exit":
                        exit = false;
                    break;
                default:
                    System.out.println("Try again");
            }
        }
    }
}
