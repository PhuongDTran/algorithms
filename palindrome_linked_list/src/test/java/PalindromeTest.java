import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeTest {
    Palindrome palindrome;

    @Test
    public void testNotAPalindrome(){
        ListNode head = ListNode.convertArrayToListNode(new int[]{1, 2, 3, 4, 5});
        palindrome = new Palindrome(head);
        boolean result = palindrome.isPalindrome();
        assertFalse(result);
    }
    @Test
    public void testOneElementPalindrome(){
        ListNode head = ListNode.convertArrayToListNode(new int[]{1});
        palindrome = new Palindrome(head);
        boolean result = palindrome.isPalindrome();
        assertTrue(result);
    }

    @Test
    public void testAOddLengthPalindrome(){
        ListNode head = ListNode.convertArrayToListNode(new int[]{1, 2, 3, 2, 1});
        palindrome = new Palindrome(head);
        boolean result = palindrome.isPalindrome();
        assertTrue(result);
    }

    @Test
    public void testAEvenLengthPalindrome(){
        ListNode head = ListNode.convertArrayToListNode(new int[]{1, 2, 3, 3, 2, 1});
        palindrome = new Palindrome(head);
        boolean result = palindrome.isPalindrome();
        assertTrue(result);
    }
}
