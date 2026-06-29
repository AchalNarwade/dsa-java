// https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/2047900732/


class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}