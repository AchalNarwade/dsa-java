//https://leetcode.com/problems/middle-of-the-linked-list/?envType=problem-list-v2&envId=linked-list

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
    public ListNode middleNode(ListNode head) {
        int countNode = 0;
        ListNode temp = head;
        //counting total nodes
        while(temp!=null){
            countNode++;
            temp = temp.next;
        }
        int midNode = countNode/2;
        temp = head;
        for(int i=0;i<midNode;i++){
            temp = temp.next;
        }
        return temp;
    }
}