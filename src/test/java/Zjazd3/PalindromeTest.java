package test.java.Zjazd3;

import main.java.Zjazd3.Palindrome;
import org.junit.Assert;
import org.junit.Test;

/**
 * summary: Test Palindrome class
 * author: Michal Wadas
 **/
public class PalindromeTest {

    private final static String PALINDROME_ONE = "Atak kata.";
    private final static String PALINDROME_TWO = "Muzo, raz daj jad za rozum.";
    private final static String PALINDROME_THREE = "Wódy żal dla żydów.";
    private final static String NOT_PALINDROME = "Jakiś teks";

    @Test
    public void testIsPalindrome() {

        Palindrome palindrome = new Palindrome();

        Assert.assertTrue(palindrome.isPalindrome(PALINDROME_ONE));
        Assert.assertTrue(palindrome.isPalindrome(PALINDROME_TWO));
        Assert.assertTrue(palindrome.isPalindrome(PALINDROME_THREE));
        Assert.assertFalse(palindrome.isPalindrome(NOT_PALINDROME));

    }

}
