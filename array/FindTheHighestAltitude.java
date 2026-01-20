// https://leetcode.com/problems/find-the-highest-altitude/?envType=problem-list-v2&envId=array
/* Time Complexity = O(n)
   Space Complexity = O(1)
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int highest = 0;
        for(int i=0;i<gain.length;i++){
            int sum = current + gain[i];
            current = sum;
            highest = Math.max(highest,current);
        }
        return highest;
    }
}