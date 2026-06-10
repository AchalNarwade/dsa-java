// https://leetcode.com/problems/merge-strings-alternately/submissions/2028919445/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int left = 0;//word1
        int right = 0;//word2
        while(left<word1.length() && right<word2.length()){
            sb.append(word1.charAt(left));
            left++;

            sb.append(word2.charAt(right));
            right++;
        }
        while(left<word1.length()){
            sb.append(word1.charAt(left));
            left++;
        }
        while(right<word2.length()){
            sb.append(word2.charAt(right));
            right++;
        }
        return sb.toString();

    }
}