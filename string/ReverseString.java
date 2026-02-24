//http://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=string

/* Time Complexity = O(n)
   Space Complexity = O(1)
*/

class Solution {
    public void reverseString(char[] s) {
         int left=0;
         int right=s.length-1;
         while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
         }

    }
}