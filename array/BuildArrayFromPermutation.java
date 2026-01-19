//https://leetcode.com/problems/build-array-from-permutation/?envType=problem-list-v2&envId=array
/* Time Complexity = O()
   Space Complexity = O()
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}