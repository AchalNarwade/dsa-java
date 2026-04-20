//https://leetcode.com/problems/two-furthest-houses-with-different-colors/submissions/1983427427/?envType=daily-question&envId=2026-04-20

//APPROACH 1:

class Solution {
    public int maxDistance(int[] colors) {
        int max=0;

        for(int i=0;i<colors.length-1;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    int sub= Math.abs(i-j);
                    max = Math.max(sub,max);
                }
            }
        }
        return max;
    }
}

//APPROACH 2:

class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        int left = 0;
        int right = colors.length-1;
        
        while(left<=right){
            if(colors[left]!=colors[right]){
                int sub = Math.abs(left-right);
                max = Math.max(sub,max);
            }
            right--;
        }

        left=0;
        right = colors.length-1;

        while(left<=right){
            if(colors[left]!=colors[right]){
                int sub = Math.abs(left-right);
                max = Math.max(sub,max);
            }
            left++;
        }
        return max;
    }
}