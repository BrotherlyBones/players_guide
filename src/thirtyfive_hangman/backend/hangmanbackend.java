package thirtyfive_hangman.backend;

import java.util.ArrayList;

public class hangmanbackend {

    //either I'm really unlucky or my formula is wrong because it doesn't feel like they're all at equal odds
    //after rigorous testing it appears dependent on the input received thus far, or that I'm going crazy.
    final private char[][] answers =
            {
                    {'H', 'A', 'Y'},//haven't seen it since i put a +1 on .length
                    {'D', 'E', 'F', 'E', 'N', 'E', 'S', 'T', 'R', 'A', 'T', 'I', 'O', 'N'},
                    {'S', 'E', 'S', 'Q', 'U', 'I', 'P', 'E', 'D', 'A', 'L', 'O', 'P', 'H', 'O', 'B', 'I', 'A'},
                    {'A', 'N', 'S', 'W', 'E', 'R'},//more common on Easy
                    {'S', 'T', 'U', 'P', 'E', 'N', 'D', 'O', 'U', 'S'},
                    {'S', 'C', 'Y', 'T', 'H', 'E'},//never seen outside of Normal
                    {'N', 'Y', 'M', 'P', 'H'},//really common on Hard
                    {'P', 'I', 'G', 'S', 'T', 'Y'},//really common on Hard
                    {'M', 'E', 'G', 'A', 'L', 'O', 'M', 'A', 'N', 'I', 'A'},
                    {'F', 'O', 'X'},
                    //duplicating the list past this point. I'm hoping that helps with variety in the answers
                    {'H', 'A', 'Y'},
                    {'D', 'E', 'F', 'E', 'N', 'E', 'S', 'T', 'R', 'A', 'T', 'I', 'O', 'N'},
                    {'S', 'E', 'S', 'Q', 'U', 'I', 'P', 'E', 'D', 'A', 'L', 'O', 'P', 'H', 'O', 'B', 'I', 'A'},
                    {'A', 'N', 'S', 'W', 'E', 'R'},
                    {'S', 'T', 'U', 'P', 'E', 'N', 'D', 'O', 'U', 'S'},
                    {'S', 'C', 'Y', 'T', 'H', 'E'},
                    {'N', 'Y', 'M', 'P', 'H'},
                    {'P', 'I', 'G', 'S', 'T', 'Y'},
                    {'M', 'E', 'G', 'A', 'L', 'O', 'M', 'A', 'N', 'I', 'A'},
                    {'F', 'O', 'X'}
            };
    private final ArrayList<Character> answer = new ArrayList<>();
    public static ArrayList<Character> progress = new ArrayList<>();
    private final ArrayList<Character> guessed = new ArrayList<>();

    public byte newGame(byte difficulty) {
        /*
         the value returned is:
        a random number going from 1 to however many words there are in the array
        minus one so that the range goes from for example 1-10 to 0-9
        converted to a byte so that it's a whole number
        used to select a specific word in the array
        that word is for-eached into an array called 'answer'
        the length of that word is subtracted from 24,
        divided by three,
        and added to the value that is given in the method's arguments
        converted to a byte

        This is done to select the correct answer from the list
        and give fewer wrong guesses to long words and more guesses to shorter words
         */
        byte wordselector = (byte) ((Math.random() * answers.length+1) - 1);
        answer.clear();
        progress.clear();
        guessed.clear();
        for (char freach : answers[wordselector]) {
            answer.add(freach);
            progress.add('_');
        }
        return (byte) ((24 - (answer.size())) / 4 + difficulty);
    }

    public boolean checkanswer(char guess, byte attemptsleft) {
        guess = Character.toUpperCase(guess);
        if ( !guessed.contains(guess) && (Character.isLetter(guess) || guess == ' ') ) {
            System.out.print("Word: ");
            for (byte pos = 0; pos < answer.size(); pos++) {
                if (guess == answer.get(pos)) {
                    progress.set(pos, guess);
                }
                System.out.print(progress.get(pos));
            }
            if (!answer.contains(guess)) {attemptsleft--;}

            System.out.print(" | Remaining: " + attemptsleft + " | Incorrect:");

            if (!answer.contains(guess)) {guessed.add(guess);}

            guessed.forEach(System.out::print);

            System.out.println(" | Guess: " + guess);
            return answer.contains(guess);
        }
        System.out.println("You already guessed that or that wasn't a letter");
        return true;
    }
}
