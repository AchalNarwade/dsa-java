//https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=array

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left<right){
            int width = right-left;
            int length = Math.min(height[left],height[right]);
            int area = width*length;
            max = Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}