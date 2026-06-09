// https://leetcode.com/problems/is-subsequence/?envType=problem-list-v2&envId=two-pointers

class Solution {
    public boolean isSubsequence(String s, String t) {
        int write = 0;
        int read = 0;

        while(write<s.length() && read<t.length()){
            if(s.charAt(write)==t.charAt(read)){
                write++;
            }
            read++;
        }
        if(write==s.length()){
            return true;
        }
        return false;
    }
}