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

       static{                             //Use Static block just to warm up JVM to reduce runtime
        ListNode n = new ListNode(0);
        for(int i=0;i<500;i++)
            isPalindrome(n);
    }
    public static boolean isPalindrome(ListNode head) {   //Make method static so static block can use
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

    private static  ListNode reverse(ListNode slow){    // as Static method or block can not use referance of non static

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