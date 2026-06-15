// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/submissions/2034146438/?envType=daily-question&envId=2026-06-15

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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int countNode = 0;

        while(temp!=null){
            temp = temp.next;
            countNode++;
        }
        int midNode = (int)Math.floor(countNode/2);
        //for only one node
        if(head==null || head.next == null){
            return null;
        }

        ListNode nextNode = head;
        ListNode prevNode = nextNode;
        for(int i=0;i<midNode;i++){
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        prevNode.next = nextNode.next;
        return head;
    }
}