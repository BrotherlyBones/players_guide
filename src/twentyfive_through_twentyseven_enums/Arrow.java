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


It sounds like they want me to make classes that have these attributes
I Would like to go the extra mile and be able to query any arrow that's been made for it's attributes
 */


public class Arrow {



    static float fletch(head tip, float length, feather quill){

        float cost = length * 0.05F;

        switch (tip){
            case head.Steel:
                cost += 10;
                break;
            case head.Wood:
                cost += 3;
                break;
            case head.Obsidian:
                cost += 5;
                break;
        }

        switch (quill){
            case feather.Plastic:
                cost += 10;
                break;
            case feather.GooseFeathers:
                cost += 3;
                break;
            case feather.TurkeyFeathers:
                cost += 5;
                break;
        }
        return cost;
    }
}
