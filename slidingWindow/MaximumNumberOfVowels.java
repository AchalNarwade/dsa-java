//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

class Solution {
    public int maxVowels(String s, int k) {
        String vowel = "aeiou";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<vowel.length();i++){
            set.add(vowel.charAt(i));
        }
        int vowelCount = 0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                vowelCount++;
            }
        }
        int maxVowel = vowelCount;
        for(int right = k;right<s.length();right++){
            char entering = s.charAt(right);
            if(set.contains(entering)){
                vowelCount++;
            }
            char leaving = s.charAt(right-k);
            if(set.contains(leaving)){
                vowelCount--;
            }
            maxVowel = Math.max(vowelCount,maxVowel);
        }
        return maxVowel;
    }
}