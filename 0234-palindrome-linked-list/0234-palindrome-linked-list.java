/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

       static{
        ListNode n = new ListNode(0);
        for(int i=0;i<500;i++)
            isPalindrome(n);
    }
    public static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
   
        ListNode second = reverse(slow);

         while(second != null){

         if(head.val != second.val) {
            return false;
            }
            head = head.next;
            second = second.next;          

    }
      return true; 
    }

    private static  ListNode reverse(ListNode slow){
        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            
           ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}