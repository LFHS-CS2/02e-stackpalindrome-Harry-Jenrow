import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test_palindrome();
    }

    @Test
    public void test_palindrome() {

        assertTrue(Main.isPalindrome("abba"));
        assertFalse(Main.isPalindrome("abc"));
        assertTrue(Main.isPalindrome("amanaplanacanalpanama"));
        assertTrue(Main.isPalindrome("neveroddoreven"));
        assertTrue(Main.isPalindrome("yobananaboy"));
        assertFalse(Main.isPalindrome("hello"));
        assertFalse(Main.isPalindrome("abcdcb"));
        assertTrue(Main.isPalindrome("a"));
        assertTrue(Main.isPalindrome(""));
    }
}
