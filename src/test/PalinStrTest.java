package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import recursion.PalindromeStr;

public class PalinStrTest {

    @Test
    public void strTest() {
        boolean isPalindrome = PalindromeStr.palindrome("radar", 0, 4);
        assertTrue(() -> isPalindrome);
    }
}
