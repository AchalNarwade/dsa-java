// https://leetcode.com/problems/maximum-subarray/submissions/2043725419/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}