//https://leetcode.com/problems/reverse-linked-list/?envType=problem-list-v2&envId=linked-list


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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode = head;
        ListNode currentNode = head.next;
        while(currentNode!=null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            //node updation
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return prevNode;
    }
}