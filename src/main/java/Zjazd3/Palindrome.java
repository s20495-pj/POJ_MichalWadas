package main.java.Zjazd3;

/**
 * Summary: Implement exercise 17: Palindrome
 * Author: Michal Wadas
 */
public class Palindrome {

    public boolean isPalindrome(String sentence) {

        int beggingOfSentence = 0;
        int endOfSentence = sentence.length() - 1;

        sentence = sentence.toLowerCase();

        // Comparing till equal
        while (beggingOfSentence <= endOfSentence) {

            char getAtBeginning = sentence.charAt(beggingOfSentence);
            char getAtEnd = sentence.charAt(endOfSentence);

            // while symbol on right side of sentence
            if (!(getAtEnd >= 'a' && getAtEnd <= 'z'))
                endOfSentence--;

            // while symbol on left side of sentence
            else if (!(getAtBeginning >= 'a' && getAtBeginning <= 'z'))
                beggingOfSentence++;

            // If characters are equal
            else if (getAtBeginning == getAtEnd) {
                beggingOfSentence++;
                endOfSentence--;
            }
            //is not palindrome
            else return false;
        }
        //is palindrome
        return true;
    }
}
