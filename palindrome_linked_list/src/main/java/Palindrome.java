public class Palindrome {
    private ListNode head;
    public Palindrome(ListNode head) {
        this.head = head;
    }

    public boolean isPalindrome(){
        ListNode endOfFirstHalf = findEndOfFirstHalf(head);
        ListNode reversedSecondHalf = reverse(endOfFirstHalf.next);
        boolean result = true;
        ListNode headRunner = head;
        while (result && reversedSecondHalf != null) {
            if (headRunner.value != reversedSecondHalf.value) {
                result = false;
            }
            headRunner = headRunner.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }
        endOfFirstHalf.next = reverse(endOfFirstHalf.next);
        return result;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    private ListNode findEndOfFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
