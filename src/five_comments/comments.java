package five_comments;

import java.util.Scanner;

public class comments {
    public static void main(String[] args){
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine(); //the subject matter, the thing you're naming.
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.nextLine();//some form of adjective
        String c = "of Doom";//apparently everything described by this program should be quite menacing
        String d = "3000";  /*  This last one is really unnecessary
                                There aren't 2999 copies of every thing you're describing
                                What are the numbers supposed to mean???
                            */
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
    }
}
/*to answer the question,
 the creation of variable 'c' and 'd' can be left out completely
 unless they are necessary for somewhere else.
 additionally, the variables should be named after their purpose.
 'b' should be called 'adjective' instead, for example.
 */