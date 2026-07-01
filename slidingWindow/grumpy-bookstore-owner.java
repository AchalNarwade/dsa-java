// https://leetcode.com/problems/grumpy-bookstore-owner/submissions/2052655449/

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int baseCount = 0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                baseCount +=customers[i];
            }
        }
        int windowGain = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                windowGain +=customers[i];
            }
        }
        int maxGain = windowGain;
        for(int right=minutes;right<grumpy.length;right++){
            if(grumpy[right]==1){
            windowGain +=customers[right];
            }
            if(grumpy[right-minutes]==1){
                windowGain -=customers[right-minutes];
            }
            maxGain = Math.max(windowGain,maxGain);
        }
        return maxGain+baseCount;
    }
}