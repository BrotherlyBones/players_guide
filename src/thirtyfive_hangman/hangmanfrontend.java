/*
I'm also going to be using this Challenge to do the assignment of week 1
where I'm instructed to make use of modifiers
Admittedly, this project isn't big enough to make use of 'abstract', 'interface'
or access mods besides 'public' and 'private'

 For the player's guide, the requirements are as follows:
v The game picks a word at random from a list of words.
The game’s state is displayed to the player, as shown above.
The player can pick a letter. If they pick a letter they already chose, pick again.
The game should update its state based on the letter the player picked.
The game needs to detect a win for the player (all letters have been guessed).
The game needs to detect a loss for the player (out of incorrect guesses).

v sounds like I'm going to need Math.random() for the list,
a foreach loop that iterates the string for the character given to check if its used or in the word,
I'll need a separate array in the frontend to display which letters hadn't been guessed and .equals() for if its done.
I'll also need an arraylist somewhere for the letters that had been guessed already

I don't know anything about CRC cards at this point in my education,
but I'm assuming that'll come up by the time I reach this challenge organically
 */

package thirtyfive_hangman;

import thirtyfive_hangman.backend.hangmanbackend;

import java.util.Scanner;

public class hangmanfrontend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hangmanbackend backend = new hangmanbackend();

        boolean loop = true;
        byte guesses = 10;

        System.out.println("Choose your difficulty:\n Easy, Normal, Hard");
        while (loop) {
            loop = false;
            switch (input.nextLine().toLowerCase()) {
                case "easy":
                    guesses = 6;
                    break;
                case "normal":
                    guesses = 3;
                    break;
                case "hard":
                    guesses = 0;
                    break;
                default:
                    loop = true;
                    System.out.println("Spelling error, try again.");
            }
        }

        guesses = backend.newGame(guesses);

        loop = !backend.checkanswer(' ', (byte) (guesses+1));
        while (loop && guesses > 0) {
            if(! backend.checkanswer( input.nextLine().charAt(0), guesses ) ){
                guesses--;
            }
            if(!hangmanbackend.progress.contains('_')){
                System.out.println("You won!");
                loop = false;
            }
        }
        //outside the while; guesses <= 0
        if(loop){
            System.out.println("You've run out of guesses. Better luck next time!");
        }
    }
}
