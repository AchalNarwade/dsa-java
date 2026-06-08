// https://leetcode.com/problems/remove-element/submissions/2026701080/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int slow = 0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
                count++;
            }
        }
        return count;
    }
}