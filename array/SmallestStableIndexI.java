// https://leetcode.com/contest/weekly-contest-498/problems/smallest-stable-index-i/submissions/1982386431/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
    int max=Integer.MIN_VALUE;
    int sub=-1;
    int min=0;
    
    for(int i=0;i<nums.length;i++){
      max=nums[i];
      List<Integer> temp = new ArrayList<>();
      for(int j=0;j<=i;j++){
        temp.add(nums[j]);
        max=Math.max(max,nums[j]);
        }
        
        min=nums[i];
        for(int x=i;x<nums.length;x++){
          min=Math.min(min,nums[x]);
          }
          sub=max-min;
          if(sub<=k){
            return i;
            }
            else{
              continue;
              }
      }
        return -1;
    }
}