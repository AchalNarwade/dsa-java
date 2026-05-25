//https://leetcode.com/problems/linked-list-cycle/submissions/2012841540/?envType=problem-list-v2&envId=linked-list

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp!=null){
        if(set.contains(temp)){
            return true;
        }else{
            set.add(temp);
        }
        temp = temp.next;
        }
        return false;
    }
}