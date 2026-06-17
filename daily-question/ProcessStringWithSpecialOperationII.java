// https://leetcode.com/problems/process-string-with-special-operations-ii/?envType=daily-question&envId=2026-06-17

class Solution {
    public char processStr(String s, long k) {
        long len = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                if(len>0){
                    len--;
                }
            }else if(ch=='#'){
                len *=2;
            }else if(ch == '%'){
                //nothing
            }else{
                len++;
            }
        }
        long idx = k;
        if(k>=len){
            return '.';
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == '*'){
                len++;
            }else if(ch == '#'){
                long oldLen = len/2;
                if(oldLen>0){
                    idx %= oldLen;
                }
                len = oldLen;
            }else if(ch == '%'){
                idx = len-1-idx;
            }else{
                if(idx == len-1){
                    return ch;
                }
                len--;
            }
        }
        return '.';
    }
}