// https://leetcode.com/problems/richest-customer-wealth/?envType=problem-list-v2&envId=array
/* Time Complexity = O(m*n)
   Space Complexity = O(1)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int highest = 0;
        for(int i=0;i<accounts.length;i++){
            int rowSum = 0;
            for(int j=0;j<accounts[i].length;j++){
                rowSum +=accounts[i][j];
            }
            highest = Math.max(highest,rowSum);
        }
        return highest;
    }
}