//https://leetcode.com/problems/sort-colors/?envType=problem-list-v2&envId=array

class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]>=nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
}